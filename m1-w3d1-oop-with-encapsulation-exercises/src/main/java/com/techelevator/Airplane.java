package com.techelevator;

public class Airplane {

	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = (String) planeNumber;
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
		int forFirstClass = ((int) bookedFirstClassSeats - (int)totalFirstClassSeats);
		return forFirstClass;
	}
	
	public int getAvailableCoachSeats() {
		int forCoach = (bookedCoachSeats - totalCoachSeats);
		return forCoach;
	}
	

	boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if ((int) forFirstClass > 0) {
			forFirstClass = true;
		} else {
			this.forFirstClass = false;
		}
}
	
	
	}
	
