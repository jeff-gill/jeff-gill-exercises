package com.techelevator.postage;

import java.math.BigDecimal;

public class SPU implements IDeliveryDriver {

	private double rate4Day = 0.0050;
	private double rate3Day = 0.050;
	private double rateNextDay = 0.075;
	private String shippingRate;
	private double rate;
	
	public SPU(String shippingRate) {
		this.shippingRate = shippingRate;
	}

	public double calculateRate(int distance, int weight) {
		weight /= 160;
		if (shippingRate == "four-day ground") {
			rate = ((weight * rate4Day) * distance);
			return rate;
		} else if (shippingRate == "two-day business") {
			rate = ((weight * rate3Day) * distance);
			return rate;
		} else if (shippingRate == "next day") {
			rate = ((weight * rateNextDay) * distance);
			return rate;
		} else {
			
			return BigDecimal
					.valueOf(rate)
					.setScale(3, BigDecimal.ROUND_HALF_DOWN)
					.doubleValue();
		}
	}

}
