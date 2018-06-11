package com.techelevator;

public class KataFizzBuzz {

	private final static int FIZZABLE = 3;
	private final static int BUZZABLE = 5;
	private final static int RANGEFLOOR = 1;
	private final static int RANGECEILING = 100;
	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";

	public String fizzBuzz(int value) {

		String returnValue = "";

		if (value < RANGEFLOOR || value > RANGECEILING) {
			return returnValue;
		}

		if (isDivisibleBy(FIZZABLE, value) || containsDigit(FIZZABLE, value)) {
			returnValue += FIZZ;
		}
		if (isDivisibleBy(BUZZABLE, value) || containsDigit(BUZZABLE, value)) {
			returnValue += BUZZ;
		}

		if (returnValue.length() < 1) {
			return String.valueOf(value);
		} else {
			return returnValue;
		}
	}

	public boolean isDivisibleBy(int multiple, int number) {
		return number % multiple == 0;
	}

	private boolean containsDigit(int digit, int number) {
		return String.valueOf(number).contains(String.valueOf(digit));
	}
}
