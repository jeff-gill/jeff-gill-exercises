package com.techelevator.postage;

import java.math.BigDecimal;

public class FexEd implements IDeliveryDriver {


	private int distanceBoost = 5;
	private int weightBoost = 3;
	private int distanceLimit = 500;
	private int weightLimit = 48;
	private int shippingRate = 20;
	
	
	@Override
	public BigDecimal calculateRate(int distance, int weight) {
		
		int calculatedRate = shippingRate; 
		
		if (distance > distanceLimit) {
			calculatedRate += distanceBoost;
		}
		if (weight > weightLimit) {
			calculatedRate += weightBoost;
		}
			return new BigDecimal(calculatedRate).setScale(2,BigDecimal.ROUND_HALF_UP);
	}


	@Override
	public String getCompanyName() {
		// 
		return "FexEd";
	}
	
	
}