package com.techelevator.postage;

public class FedEx extends Postage implements IDeliveryDriver {

	private int weight;
	private int distance;

	public FedEx(String name, int weight, int distance) {

		super("FedEx", weight, distance, shippingClass);

		double rate = 20.00;
		if (distance > 500) {
			rate += 5.00;

		}
		if (weight > 48) {
			rate += 3.00;
		}
		else {
			rate = rate;
			
		}
	}
	
	@Override
	public void getShippingClass() {
		shippingClass = getShippingClass;
	}

}