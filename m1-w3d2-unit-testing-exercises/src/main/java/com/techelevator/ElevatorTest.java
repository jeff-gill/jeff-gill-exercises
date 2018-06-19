package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	
	private Elevator elevator1;

	@Before
	public void setUp() throws Exception {
		elevator1 = new Elevator(1, 4);
	}

	@Test
	public void test_get_shaft_sumber() {
		Assert.assertEquals(1,elevator1.getShaftNumber());
	}

	@Test
	public void test_get_number_of_levels() {
		Assert.assertEquals(4,elevator1.get`());
	}

	@Test
	public void testIsDoorOpen() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsMoving() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testOpenDoor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testCloseDoor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGoUp() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGoDown() {
		fail("Not yet implemented"); // TODO
	}

}
