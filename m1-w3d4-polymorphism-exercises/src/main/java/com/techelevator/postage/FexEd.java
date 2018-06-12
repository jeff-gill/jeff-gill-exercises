package com.techelevator.postage;

public class FexEd implements IDeliveryDriver {

	protected double rate = 20.00;
	private double distanceBoost = 5.00;
	private double weightBoost = 3.00;
	private int distanceLimit = 500;
	private int weightLimit = 48;

	@Override
	public double calculateRate(int distance, double weight) {
		if (distance > weightBoost && weight > weightLimit) {
			rate += (distanceBoost + weightBoost);
		}
		if (distance > distanceLimit) {
			rate += distanceBoost;

		}
		if (weight > weightLimit) {
			rate += weightBoost;
		}
			return rate;
	}
}