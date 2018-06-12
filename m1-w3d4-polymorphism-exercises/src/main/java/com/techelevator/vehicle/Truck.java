package com.techelevator.vehicle;

public class Truck implements IVehicle {

	private double toll;
	private int numberOfAxels;
	private double rate;

	public Truck(double toll, int numberOfAxels, int distance) {
		this.toll = toll;
		this.numberOfAxels = numberOfAxels;
	}

	public double calculateRate(double toll) {
		if (numberOfAxels <= 5) {
			rate = numberOfAxels * 0.040;
		}
		if (numberOfAxels <= 7) {
			rate = numberOfAxels * 0.045;
		}
		else {
			rate = numberOfAxels * 0.048;
		}
		return rate;
	}

	@Override
	public Integer calculateToll(int distance) {
		return (int) (toll = (rate * getDistance()));
	}

	@Override
	public double getDistance() {
		return 0;
	}

	public double getToll() {
		return toll;
	}

	public void setDistance(int distance) {
	}



}

