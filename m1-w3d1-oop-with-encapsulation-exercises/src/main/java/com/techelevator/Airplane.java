
//oop-with-encapsulation-exercises

package com.techelevator;

public class Airplane {

	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	private int availableFirstClassSeats;
	private int availableCoachSeats;

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

	public int getAvailableFirstClassSeats() {
		availableFirstClassSeats = (totalFirstClassSeats - bookedFirstClassSeats);
		return availableFirstClassSeats;
	}

	public int getAvailableCoachSeats() {
		availableCoachSeats = (totalCoachSeats - bookedCoachSeats);
		return availableCoachSeats;
	}

	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass) {
			if (totalNumberOfSeats <= getAvailableFirstClassSeats()) {
				availableFirstClassSeats -= totalNumberOfSeats;
				bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
		} else {
			if (totalNumberOfSeats <= getAvailableCoachSeats()) {
				availableCoachSeats -= totalNumberOfSeats;
				bookedCoachSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
		}
	}
}
