package com.techelevator.postage;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FexEdTest {

	private FexEd standardRate;

	@Before
	public void setup() {
		standardRate = new FexEd();
	}

	@Test
	public void verify_shipping_rate_with_close_distance_and_low_weight() {
		this.verify_rate_is_correct(500, 48, 20);
	}

	@Test
	public void verify_shipping_rate_with_far_distance_and_low_weight() {
		this.verify_rate_is_correct(501, 48, 25);
	}

	@Test
	public void verify_shipping_rate_with_close_distance_and_high_weight() {
		this.verify_rate_is_correct(500, 49, 23);
	}

	@Test
	public void verify_shipping_rate_with_far_distance_and_high_weight() {
		this.verify_rate_is_correct(501, 49, 28);
	}

	private void verify_rate_is_correct(int distance, int weight, double expectedRate) {
		BigDecimal calculateRate = standardRate.calculateRate(distance, weight);
		Assert.assertEquals(new BigDecimal(expectedRate).setScale(2, BigDecimal.ROUND_HALF_UP), calculateRate);
	}
}
