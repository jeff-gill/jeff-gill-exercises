package com.techelevator.postage;

public class SPU implements IDeliveryDriver {

	private double rate4Day = 0.0050;
	private double rate3Day = 0.050;
	private double rateNextDay = 0.075;
	private String shippingClass;
	private double weightInPounds;
	protected double rate;

	public SPU(String shippingClass) {
		this.shippingClass = shippingClass;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		weightInPounds = weight / 16;
		if (shippingClass == "four-day gound") {
			rate = (weightInPounds * rate4Day) * distance;
		}
		if (shippingClass == "two-day business") {
			rate = (weightInPounds * rate3Day) * distance;

		}
		if (shippingClass == "next day") {
			rate = (weightInPounds * rate4Day) * distance;
		}
		return rate;
	}

}
