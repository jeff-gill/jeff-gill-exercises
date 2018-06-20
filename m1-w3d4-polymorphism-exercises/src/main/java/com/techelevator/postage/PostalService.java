package com.techelevator.postage;

import java.math.BigDecimal;

public class PostalService implements IDeliveryDriver {

	private String perMileClass;

	public PostalService(String perMileClass) {
		this.perMileClass = perMileClass;
	}

	
	@Override
	public BigDecimal calculateRate(int distance, int weight) {
		
		double perMileRate = 0;
		
		if (perMileClass == "1st Class") {
			if (weight <= 2 && weight > 0) {
				perMileRate = 0.035;
			}
			if (weight > 2 && weight < 9) {
				perMileRate = 0.040;
			}
			if (weight > 9 && weight < 16) {
				perMileRate = 0.047;
			}
			if (weight >= 16 && weight <= (16 * 3)) {
				perMileRate = 0.195;
			}
			if (weight > (16 * 3) && weight <= (16 * 8)) {
				perMileRate = 0.450;
			}
			if (weight >= (16 * 9)) {
				perMileRate = 0.500;
			}
			
		}

		if (perMileClass == "2nd Class") {
			if (weight <= 2 && weight > 0) {
				perMileRate = 0.0035;
			}
			if (weight > 2 && weight < 9) {
				perMileRate = 0.0040;
			}
			if (weight > 9 && weight < 16) {
				perMileRate = 0.0047;
			}
			if (weight > 16 && weight <= (16 * 3)) {
				perMileRate = 0.0195;
			}
			if (weight > (16 * 3) && weight <= (16 * 8)) {
				perMileRate = 0.0450;
			}
			if (weight >= (16 * 9)) {
				perMileRate = 0.0500;
			}
		}
		if (perMileClass == "3rd Class") {
			if (weight <= 2 && weight > 0) {
				perMileRate = 0.0020;
			}
			if (weight > 2 && weight < 9) {
				perMileRate = 0.0022;
			}
			if (weight > 9 && weight < 16) {
				perMileRate = 0.0024;
			}
			if (weight >= 16 && weight <= (16 * 3)) {
				perMileRate = 0.0150;
			}
			if (weight > (16 * 3) && weight <= (16 * 8)) {
				perMileRate = 0.0160;
			}
			if (weight >= (16 * 9)) {
				perMileRate = 0.0170;
			}
		}
		return new BigDecimal(perMileRate *distance).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	@Override
	public String getCompanyName() {
		return "Postal Service (" + perMileClass + ")";
}
}
