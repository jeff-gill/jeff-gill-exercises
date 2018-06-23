package com.techelevator.postage;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class SPUTest {

	@Test
	public void verify_calculate_rate_for_rateNextDay() {
		verify_rate_is_correct("next day", 501, 50, 0.075);
	}

	@Test
	public void verify_calculate_rate_for_rate2Day() {
		verify_rate_is_correct("two-day business", 501, 50, 0.050);
	}

	@Test
	public void verify_calculate_rate_for_rate4Day() {
		verify_rate_is_correct("four-day ground", 340, 16, 0.0050);
	}

	private void verify_rate_is_correct(String rateClass, int distance, int weightInPounds, double expectedRate) {
		IDeliveryDriver spu = new SPU(rateClass);
		BigDecimal calculateRate = spu.calculateRate(distance, weightInPounds);
		Assert.assertEquals(new BigDecimal(expectedRate).setScale(2, BigDecimal.ROUND_HALF_UP), calculateRate);
	}
}
