package com.techelevator.postage;

import java.math.BigDecimal;

public class FexEd implements IDeliveryDriver {


	private double distanceBoost = 5.00;
	private double weightBoost = 3.00;
	private int distanceLimit = 500;
	private int weightLimit = 48;
	private double shippingRate = 20.00;

	public FexEd(double shippingRate) {
		this.shippingRate = shippingRate;
	}
	
	@Override
	public double calculateRate(int distance, int weight) {
	
		if (distance > distanceLimit) {
			shippingRate += distanceBoost;

		}
		if (weight > weightLimit) {
			shippingRate += weightBoost;
		}
			return BigDecimal.valueOf(shippingRate).
					setScale(3, BigDecimal.ROUND_HALF_DOWN).doubleValue();
	}

	public double getShippingRate() {
		return shippingRate;
	}

	public void setShippingRate(double shippingRate) {
		this.shippingRate = shippingRate;
	}
	
}