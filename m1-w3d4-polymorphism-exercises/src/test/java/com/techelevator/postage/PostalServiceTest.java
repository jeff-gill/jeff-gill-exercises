package com.techelevator.postage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostalServiceTest {

	private PostalService firstClassPostalService;
	private PostalService secondClassPostalService;
	private PostalService thirdClassPostalService;

	@Before
	public void setup() {
		firstClassPostalService = new PostalService("1st Class");
		secondClassPostalService = new PostalService("2nd Class");
		thirdClassPostalService = new PostalService("3rd Class");

	}

	@Test
	public void verify_calculate_rate_for_1st_class_first_tier() {
		double calculateRate = firstClassPostalService.calculateRate(10, 1);
		Assert.assertEquals(0.35, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_1st_class_second_tier() {
		double calculateRate = firstClassPostalService.calculateRate(10, 3);
		Assert.assertEquals(0.40, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_1st_class_third_tier() {
		double calculateRate = firstClassPostalService.calculateRate(10, 10);
		Assert.assertEquals(0.47, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_1st_class_fourth_tier() {
		double calculateRate = firstClassPostalService.calculateRate(10, 17);
		Assert.assertEquals(1.95, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_1st_class_fifth_tier() {
		double calculateRate = firstClassPostalService.calculateRate(10, 54);
		Assert.assertEquals(4.50, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_1st_class_sixth_tier() {
		double calculateRate = firstClassPostalService.calculateRate(10, 160);
		Assert.assertEquals(5.00, calculateRate, 0);
	}
	
	@Test
	public void verify_calculate_rate_for_2nd_class_first_tier() {
		double calculateRate = secondClassPostalService.calculateRate(10, 1);
		Assert.assertEquals(0.035, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_second_tier() {
		double calculateRate = secondClassPostalService.calculateRate(10, 3);
		Assert.assertEquals(0.040, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_third_tier() {
		double calculateRate = secondClassPostalService.calculateRate(10, 10);
		Assert.assertEquals(0.047, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_fourth_tier() {
		double calculateRate = secondClassPostalService.calculateRate(10, 17);
		Assert.assertEquals(0.195, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_fifth_tier() {
		double calculateRate = secondClassPostalService.calculateRate(10, 54);
		Assert.assertEquals(0.450, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_2nd_class_sixth_tier() {
		double calculateRate = secondClassPostalService.calculateRate(10, 160);
		Assert.assertEquals(0.500, calculateRate, 0);
	}
	
	
	
	
	
	@Test
	public void verify_calculate_rate_for_3rd_class_first_tier() {
		double calculateRate = thirdClassPostalService.calculateRate(10, 1);
		Assert.assertEquals(0.020, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_second_tier() {
		double calculateRate = thirdClassPostalService.calculateRate(10, 3);
		Assert.assertEquals(0.022, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_third_tier() {
		double calculateRate = thirdClassPostalService.calculateRate(10, 10);
		Assert.assertEquals(0.024, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_fourth_tier() {
		double calculateRate = thirdClassPostalService.calculateRate(10, 17);
		Assert.assertEquals(0.150, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_fifth_tier() {
		double calculateRate = thirdClassPostalService.calculateRate(10, 54);
		Assert.assertEquals(0.160, calculateRate, 0);
	}

	@Test
	public void verify_calculate_rate_for_3rd_class_sixth_tier() {
		double calculateRate = thirdClassPostalService.calculateRate(10, 160);
		Assert.assertEquals(0.170, calculateRate, 0);
	}
}
