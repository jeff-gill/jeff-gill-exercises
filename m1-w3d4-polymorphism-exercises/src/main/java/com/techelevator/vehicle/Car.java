package com.techelevator.vehicle;

public class Car implements IVehicle {

	private double toll;
	private int numberOfAxels;
	private double rate;
	private int distance;

	public Car(double toll, int numberOfAxels, int distance) {
		this.setToll(toll);
		this.setNumberOfAxels(numberOfAxels);
		this.distance = distance;

	}

	public Double calculateToll(double toll, boolean trailer) {
		if (trailer = false) {
			toll = (distance * 0.020);
		if (trailer = true) {
			toll =((distance * 0.020) + 1.00);
		}
		return toll;
		}
		return toll;
			
	}

	public double getToll() {
		return toll;
	}

	public void setToll(double toll) {
		this.toll = toll;
	}

	public int getNumberOfAxels() {
		return numberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		this.numberOfAxels = numberOfAxels;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer calculateToll(int toll) {
		// TODO Auto-generated method stub
		return null;
	}


}
