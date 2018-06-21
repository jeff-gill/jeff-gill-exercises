package com.techelevator.postage;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class SPUTest {

	@Test
	public void verify_calculate_rate_for_rateNextDay() {
		verify_rate_is_correct("next day", 340, 1, (1 * 0.075) * 340);
	}

	@Test
	public void verify_calculate_rate_for_rate2Day() {
		verify_rate_is_correct("two-day business", 340, 1, (1 * 0.050) * 340);
	}

	@Test
	public void verify_calculate_rate_for_rate4Day() {
		verify_rate_is_correct("four-day ground", 340, 1, (1 * 0.0050) * 340);
	}

	private void verify_rate_is_correct(String rateClass, int distance, int weight, double expectedRate) {
		IDeliveryDriver spu = new SPU(rateClass);
		BigDecimal calculateRate = spu.calculateRate(distance, weight);
		Assert.assertEquals(new BigDecimal(expectedRate).setScale(2, BigDecimal.ROUND_HALF_UP), calculateRate);
	}
}
