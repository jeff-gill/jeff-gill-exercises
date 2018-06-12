package com.techelevator;

public class KataRomanNumerals {
	
	// private final static int 

	public String romanNumerals(int value) {

		String returnValue = "";

		if (value == 0) {
			return returnValue;
		}
		if (value == 1) {
			returnValue = "I";
			return returnValue;
		}
		if (value == 5) {
			returnValue = "V";
			return returnValue;
		}
		if (value == 10) {
			returnValue = "X";
			return returnValue;
		}
		if (value == 50) {
			returnValue = "L";
			return returnValue;
		}
		if (value == 100) {
			returnValue = "C";
			return returnValue;
		}
		if (value == 500) {
			returnValue = "D";
			return returnValue;
		}
		if (value == 1000) {
			returnValue = "M";
			return returnValue;
		}
//		if (returnValue.length() < 1) {
//			return String.valueOf(value);
//		} 
		else {
			return returnValue;
		}
	}
}
