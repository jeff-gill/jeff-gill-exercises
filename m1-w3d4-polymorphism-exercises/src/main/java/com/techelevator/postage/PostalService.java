package com.techelevator.postage;

public class PostalService implements IDeliveryDriver {

	protected double rate;
	private String perMileClass;
	private int weightInOunces;

	public PostalService(String perMileClass) {
		this.perMileClass = perMileClass;
	}

	
	@Override
	public double calculateRate(int distance, double weight) {
		distance = 0;
		weightInOunces = (int) weight;
		if (perMileClass == "1st Class") {
			if (weightInOunces <= 2 && weightInOunces > 0) {
				rate = 0.035;
			}
			if (weightInOunces > 2 && weightInOunces < 9) {
				rate = 0.040;
			}
			if (weightInOunces > 9 && weightInOunces < 16) {
				rate = 0.047;
			}
			if (weightInOunces > 16 && weightInOunces <= (16 * 3)) {
				rate = 0.195;
			}
			if (weightInOunces > (16 * 3) && weightInOunces <= (16 * 8)) {
				rate = 0.450;
			}
			if (weightInOunces >= (16 * 9)) {
				rate = 0.500;
			}
			return rate;
		}

		if (perMileClass == "2nd Class") {
			if (weightInOunces <= 2 && weightInOunces > 0) {
				rate = 0.0035;
			}
			if (weightInOunces > 2 && weightInOunces < 9) {
				rate = 0.0040;
			}
			if (weightInOunces > 9 && weightInOunces < 16) {
				rate = 0.0047;
			}
			if (weightInOunces > 16 && weightInOunces <= (16 * 3)) {
				rate = 0.0195;
			}
			if (weightInOunces > (16 * 3) && weightInOunces <= (16 * 8)) {
				rate = 0.0450;
			}
			if (weightInOunces >= (16 * 9)) {
				rate = 0.0500;
			}
			return rate;
		}
		if (perMileClass == "3rd Class") {
			if (weightInOunces <= 2 && weightInOunces > 0) {
				rate = 0.0020;
			}
			if (weightInOunces > 2 && weightInOunces < 9) {
				rate = 0.0022;
			}
			if (weightInOunces > 9 && weightInOunces < 16) {
				rate = 0.0024;
			}
			if (weightInOunces > 16 && weightInOunces <= (16 * 3)) {
				rate = 0.0151;
			}
			if (weightInOunces > (16 * 3) && weightInOunces <= (16 * 8)) {
				rate = 0.0160;
			}
			if (weightInOunces >= (16 * 9)) {
				rate = 0.0170;
			}
			return rate;
		}
		return rate;
	}

	public double getRate() {
		return rate;
	}
	
	
	public void setRate(double rate) {
		this.rate = rate;
	}


	public String getPerMileClass() {
		return perMileClass;
	}


	public void setPerMileClass(String perMileClass) {
		this.perMileClass = perMileClass;
	}


	public int getWeightInOunces() {
		return weightInOunces;
	}


	public void setWeightInOunces(int weightInOunces) {
		this.weightInOunces = weightInOunces;
	}


}
