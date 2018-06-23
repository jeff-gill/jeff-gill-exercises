package com.techelevator.vehicle_old;

public class Car implements IVehicle {

	private double toll;
	private int numberOfAxels;
	private double rate;
	private int distance;
	private String trailerStatus;

	public Car(double toll, int numberOfAxels, int distance, String trailerStatus) {
		this.setToll(toll);
		this.setNumberOfAxels(numberOfAxels);
		this.distance = distance;

	}

	public Car(String string) {
		// TODO Auto-generated constructor stub
	}

	public Double calculateToll(double toll, boolean trailer) {
		if (VehicleMain.getTrailerStatus = "NO") {
			toll = (distance * 0.020);
		}
		if (VehicleMain.trailerStatus = "YES") {
			toll = ((distance * 0.020) + 1.00);
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

	@Override
	public String getVehicleName() {

		return "Car";

	}
}
