package com.techelevator.postage;

import java.math.BigDecimal;

public class SPU implements IDeliveryDriver {

	private double rate4Day = 0.0050;
	private double rate2Day = 0.050;
	private double rateNextDay = 0.075;
	private String shippingRate;

	public SPU(String shippingRate) {
		this.shippingRate = shippingRate;
	}

	@Override
	public BigDecimal calculateRate(int distance, int weight) {
		weight = weight / 16;
		double calculatedRates = 0;
	
		if (shippingRate == "four-day ground") {
			calculatedRates = (weight * rate4Day);
			
		} else if (shippingRate == "two-day business") {
			calculatedRates = (weight * rate2Day);
		
		} else if (shippingRate == "next day") {
			calculatedRates = (weight * rateNextDay);
		}
		BigDecimal calculatedRate = new BigDecimal(calculatedRates * distance).setScale(2,BigDecimal.ROUND_HALF_UP);
		return calculatedRate;
		}
	@Override
	public String getCompanyName() {
		return "SPU (" + shippingRate + ")";
	}
}