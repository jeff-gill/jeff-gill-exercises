package com.techelevator.postage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FexEdTest {

	private FexEd standardRate;
	

	@Before
	public void setup() {
		standardRate = new FexEd(20.00);
	}

	@Test
	public void verify_shipping_rate_with_close_distance_and_low_weight() {
		double calculateRate = standardRate.calculateRate(1, 1);
		Assert.assertEquals(20.00, calculateRate, 0);
	}

	@Test
	public void verify_shipping_rate_with_far_distance_and_low_weight() {
		double calculateRate = standardRate.calculateRate(600, 1);
		Assert.assertEquals(25.00, calculateRate, 0);
	}

	@Test
	public void verify_shipping_rate_with_close_distance_and_high_weight() {
		double calculateRate = standardRate.calculateRate(1, 50);
		Assert.assertEquals(23.00, calculateRate, 0);
	}

	@Test
	public void verify_shipping_rate_with_far_distance_and_high_weight() {
		double calculateRate = standardRate.calculateRate(600, 50);
		Assert.assertEquals(28.00, calculateRate, 0);
	}
}
