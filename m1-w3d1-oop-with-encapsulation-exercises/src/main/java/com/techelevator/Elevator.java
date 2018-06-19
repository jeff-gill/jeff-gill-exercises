
//oop-with-encapsulation-exercises

package com.techelevator;

public class Elevator {

<<<<<<< HEAD
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;

=======
	private int currentFloor	;
	private int numberOfFloors;
	private boolean doorOpen;
	

		
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	public Elevator(int totalNumberOfFloors) {
		this.currentFloor = 1;
		this.numberOfFloors = totalNumberOfFloors;
	}
<<<<<<< HEAD

	public void openDoor() {
		doorOpen = true;
	}

	public void closeDoor() {
		doorOpen = false;
	}

=======
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	/*
	 * sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
	 */
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	public void goUp(int desiredFloor) {
		if (!doorOpen && desiredFloor >= this.currentFloor && desiredFloor <= numberOfFloors) {
			this.currentFloor = desiredFloor;
		}
	}
<<<<<<< HEAD

	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor <= this.currentFloor && desiredFloor >= 1) {
			this.currentFloor = desiredFloor;
		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}
=======
	
	/*
	 *  sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.
	 */
	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor <= this.currentFloor && desiredFloor > 0) {
			this.currentFloor = desiredFloor;
		}	
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
	
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
}
