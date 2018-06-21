package com.techelevator.postage;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class PostalServiceTest {

	@Test
	public void verify_calculate_rate_for_1st_class_first_tier_lower_limit() {
		verify_rate_is_correct("1st Class", 340, 1, (340 * 0.035));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_first_tier_upper_limit() {
		verify_rate_is_correct("1st Class", 340, 2, (340 * 0.035));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_second_tier_lower_limit() {
		verify_rate_is_correct("1st Class", 340, 3, (340 * 0.040));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_second_tier_upper_limit() {
		verify_rate_is_correct("1st Class", 340, 8, (340 * 0.040));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_third_tier_lower_limit() {
		verify_rate_is_correct("1st Class", 340, 9, (340 * 0.047));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_third_tier_upper_limit() {
		verify_rate_is_correct("1st Class", 340, 15, (340 * 0.047));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_fourth_tier_lower_limit() {
		verify_rate_is_correct("1st Class", 340, 16, (340 * 0.195));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_fourth_tier_upper_limit() {
		verify_rate_is_correct("1st Class", 340, (3 * 16), (340 * 0.195));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_fifth_tier_lower_limit() {
		verify_rate_is_correct("1st Class", 340, (4 * 16), (340 * 0.450));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_fifth_tier_upper_limit() {
		verify_rate_is_correct("1st Class", 340, (8 * 16), (340 * 0.450));
	}

	@Test
	public void verify_calculate_rate_for_1st_class_sixth_tier() {
		verify_rate_is_correct("1st Class", 340, (9 * 16), (340 * 0.500));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_first_tier_lower_limit() {
		verify_rate_is_correct("2nd Class", 340, 1, (340 * 0.0035));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_first_tier_upper_limit() {
		verify_rate_is_correct("2nd Class", 340, 2, (340 * 0.0035));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_second_tier_lower_limit() {
		verify_rate_is_correct("2nd Class", 340, 3, (340 * 0.0040));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_second_tier_upper_limit() {
		verify_rate_is_correct("2nd Class", 340, 8, (340 * 0.0040));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_third_tier_lower_limit() {
		verify_rate_is_correct("2nd Class", 340, 9, (340 * 0.0047));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_third_tier_upper_limit() {
		verify_rate_is_correct("2nd Class", 340, 15, (340 * 0.0047));
	}

	@Test
	public void verify_calculate_rate_for_2ndclass_fourth_tier_lower_limit() {
		verify_rate_is_correct("2nd Class", 340, 16, (340 * 0.0195));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_fourth_tier_upper_limit() {
		verify_rate_is_correct("2nd Class", 340, (3 * 16), (340 * 0.0195));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_fifth_tier_lower_limit() {
		verify_rate_is_correct("2nd Class", 340, (4 * 16), (340 * 0.0450));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_fifth_tier_upper_limit() {
		verify_rate_is_correct("2nd Class", 340, (8 * 16), (340 * 0.0450));
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_sixth_tier() {
		verify_rate_is_correct("2nd Class", 340, (9 * 16), (340 * 0.0500));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_first_tier_lower_limit() {
		verify_rate_is_correct("3rd Class", 340, 1, (340 * 0.0020));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_first_tier_upper_limit() {
		verify_rate_is_correct("3rd Class", 340, 2, (340 * 0.0020));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_second_tier_lower_limit() {
		verify_rate_is_correct("3rd Class", 340, 3, (340 * 0.0022));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_second_tier_upper_limit() {
		verify_rate_is_correct("3rd Class", 340, 8, (340 * 0.0022));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_third_tier_lower_limit() {
		verify_rate_is_correct("3rd Class", 340, 9, (340 * 0.0024));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_third_tier_upper_limit() {
		verify_rate_is_correct("3rd Class", 340, 15, (340 * 0.0024));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_fourth_tier_lower_limit() {
		verify_rate_is_correct("3rd Class", 340, 16, (340 * 0.0150));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_fourth_tier_upper_limit() {
		verify_rate_is_correct("3rd Class", 340, (3 * 16), (340 * 0.0150));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_fifth_tier_lower_limit() {
		verify_rate_is_correct("3rd Class", 340, (4 * 16), (340 * 0.0160));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_fifth_tier_upper_limit() {
		verify_rate_is_correct("3rd Class", 340, (8 * 16), (340 * 0.0160));
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_sixth_tier() {
		verify_rate_is_correct("3rd Class", 340, (9 * 16), (340 * 0.0170));
	}

	private void verify_rate_is_correct(String rateClass, int distance, int weight, double expectedRate) {
		IDeliveryDriver postalService = new PostalService(rateClass);
		BigDecimal calculateRate = postalService.calculateRate(distance, weight);
		Assert.assertEquals(new BigDecimal(expectedRate).setScale(2, BigDecimal.ROUND_HALF_UP), calculateRate);
	}
}
