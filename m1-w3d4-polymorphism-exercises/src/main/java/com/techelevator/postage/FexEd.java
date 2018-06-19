package com.techelevator.postage;

import java.math.BigDecimal;

public class FexEd implements IDeliveryDriver {


	private BigDecimal distanceBoost = new BigDecimal(5);
	private BigDecimal weightBoost = new BigDecimal(3);
	private BigDecimal distanceLimit = new BigDecimal(500);
	private BigDecimal weightLimit = new BigDecimal(48);
	private BigDecimal shippingRate = new BigDecimal(20);

	public FexEd(BigDecimal shippingRate) {
		this.shippingRate = shippingRate;
	}
	
	@Override
	public BigDecimal calculateRate(BigDecimal distance, int weight) {
	
		if (BigDecimal.valueOf(distance) {
				BigDecimal(distanceLimit)) {
			return BigDecimal(shippingRate).add(BigDecimal(distanceBoost));

		}
		if (BigDecimal(weight > weightLimit) {
			shippingRate += weightBoost;
		}
			return BigDecimal.valueOf(shippingRate).
					setScale(3, BigDecimal.ROUND_HALF_DOWN).doubleValue();
	}

	public BigDecimal getShippingRate() {
		return shippingRate;
	}

	public void setShippingRate(BigDecimal shippingRate) {
		this.shippingRate = shippingRate;
	}
	
}