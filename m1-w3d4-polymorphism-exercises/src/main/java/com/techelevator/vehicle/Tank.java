package com.techelevator.vehicle;

public class Tank implements IVehicle {

	private double toll;
	private int numberOfAxels;
	private double rate;

	public Tank(double toll, int numberOfAxels, int distance) {
		this.toll = toll;
		this.numberOfAxels = numberOfAxels;
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




}
