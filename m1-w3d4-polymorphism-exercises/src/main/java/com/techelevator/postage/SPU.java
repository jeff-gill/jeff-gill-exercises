package com.techelevator.postage;

import java.math.BigDecimal;

public class SPU implements IDeliveryDriver {

	private double rate4Day = 0.0050;
	private double rate3Day = 0.050;
	private double rateNextDay = 0.075;
	private String shippingRate;

	
	
	public SPU(String shippingRate) {
		this.shippingRate = shippingRate;
	}

	@Override
	public BigDecimal calculateRate(int distance, int weight) {
		double calculatedRate = 0;
		weight /= 160;
		if (shippingRate == "four-day ground") {
			calculatedRate = ((weight * rate4Day) * distance);
			
		} else if (shippingRate == "two-day business") {
			calculatedRate = ((weight * rate3Day) * distance);
		
		} else if (shippingRate == "next day") {
			calculatedRate = ((weight * rateNextDay) * distance);
		}
			return new BigDecimal(calculatedRate).setScale(2,BigDecimal.ROUND_HALF_UP);
		}
	@Override
	public String getCompanyName() {
		return "SPU (" + shippingRate + ")";
	}
}