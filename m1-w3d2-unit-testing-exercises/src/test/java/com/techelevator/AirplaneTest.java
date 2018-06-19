package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {

	private Airplane airplane1;

	@Before
	public void setUp() {
		airplane1 = new Airplane(10, 50);
	}

	@Test
	public void test_Airplane() {
		Assert.assertEquals(10, airplane1.getTotalFirstClassSeats());
	}

	@Test
	public void test_plane_number_null() {
		Assert.assertEquals(null, airplane1.getPlaneNumber());
	}

	@Test
	public void test_booked_first_class_seats() {
		Assert.assertEquals(0, airplane1.getAvailableFirstClassSeats());
	}

	@Test
	public void test_booked_coach_class_seats() {
		Assert.assertEquals(50, airplane1.getAvailableCoachSeats());
	}

	@Test
	public void testGetPlaneNumber() {
		Assert.assertEquals(null, airplane1.getPlaneNumber());
	}

	@Test
	public void test_reserve_first_class_seats_available() {
		boolean result = airplane1.Reserve(true, 10);
		Assert.assertEquals(true, result);
	}

	@Test
	public void test_reserve_first_class_seats_not_available() {
		boolean result = airplane1.Reserve(true, 1);
		Assert.assertEquals(true, result);
	}

}
