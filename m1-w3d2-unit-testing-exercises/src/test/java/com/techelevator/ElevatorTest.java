package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {

	Elevator elevator;
	
	@Before
	public void setup() {
	elevator = new Elevator(1,13);
	}

	@Test
	public void elevator_should_not_go_up_with_door_open() {
		// Arrange - open the door
		elevator.isDoorOpen();
		//Act - move the elevator
		elevator.isGoUp(5);
		//Assert - 
		int currentLevel = elevator.getCurrentLevel();
				Assert.assertEquals(5, currentLevel);
	} 

	
	
}
