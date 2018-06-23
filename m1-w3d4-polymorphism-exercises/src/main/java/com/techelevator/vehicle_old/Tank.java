package com.techelevator.vehicle_old;

public class Tank implements IVehicle {

	private double toll;
	private int numberOfAxels;
	private double rate;

	public Tank(double toll, int numberOfAxels, int distance) {
		this.toll = toll;
		this.setNumberOfAxels(numberOfAxels);
	}

	public double calculateToll(double toll) {
		toll = 0;
		return toll;
	}

	@Override
	public Integer calculateToll(int distance) {
		toll = 0;
		return (int) toll;
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
	public String getVehicleName() {

		return "Tank";

	}




}
