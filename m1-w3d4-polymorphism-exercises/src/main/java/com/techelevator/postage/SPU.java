package com.techelevator.postage;

import java.math.BigDecimal;

public class SPU implements IDeliveryDriver {

	private BigDecimal rate4Day = new BigDecimal(0.0050);
	private BigDecimal rate3Day = new BigDecimal(0.050);
	private BigDecimal rateNextDay = new BigDecimal(0.075);
	private String shippingRate;
	private BigDecimal rate;
	
	public SPU(String shippingRate) {
		this.shippingRate = shippingRate;
	}

	public BigDecimal calculateRate(BigDecimal distance, int weight) {
		weight /= 160;
		if (shippingRate == "four-day ground") {
			BigDecimal rate = ((BigDecimal.valueOf(weight).multiply(rate4Day)).multiply(distance));
			return rate;
		} else if (shippingRate == "two-day business") {
			rate = ((BigDecimal.valueOf(weight).multiply(rate3Day)).multiply(distance));
			return rate;
		} else if (shippingRate == "next day") {
			rate = ((BigDecimal.valueOf(weight).multiply(rateNextDay)).multiply(distance));
			return rate;
		} else {
			
			return rate;
		}
	}

}
