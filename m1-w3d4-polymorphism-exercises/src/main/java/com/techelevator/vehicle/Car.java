package com.techelevator.vehicle;

public class Car implements IVehicle {

	private double toll;
	private int numberOfAxels;
	private double rate;
	private int distance;

	public Car(double toll, int numberOfAxels, int distance) {
		this.toll = toll;
		this.numberOfAxels = numberOfAxels;
		this.distance = distance;

	}

	@Override
	public double getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Double calculateToll(double toll, boolean trailer) {
		if (trailer = false) {
			toll = (distance * 0.020);
		if (trailer = true) {
			toll =((distance * 0.020) + 1.00);
		}
		return toll;
		}
			
	}

	@Override
	public Integer calculateToll(int toll) {
		// TODO Auto-generated method stub
		return null;
	}

}
