package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FizzWriter {

	// FizzBuzz.txt
	private final static int FIZZABLE = 3;
	private final static int BUZZABLE = 5;
	private final static int RANGEFLOOR = 1;
	private final static int RANGECEILING = 100;
	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";
	private final static int value = 0;

	public static String main(String[] args) {
		
		File newDirectory = new File(
				"/Users/jgill/development/jeffgill-java-blue-exercises/m1-w4d3-file-io-part2-exercises/src/main/java/com/techelevator/FizzBuzz");
		if (newDirectory.exists()) {
			System.exit(1);
		} else {
			if (newDirectory.mkdir()) {
				System.exit(1);
			} else {
				System.exit(1);
			}
		}
		File newFile = new File(
				"/Users/jgill/development/jeffgill-java-blue-exercises/m1-w4d3-file-io-part2-exercises/src/main/java/com/techelevator/FizzBuzz, FizzBuzz.txt");
		newFile.createNewFile();
		
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

	public static boolean isDivisibleBy(int multiple, int number) {
		return number % multiple == 0;
	}

	private static boolean containsDigit(int digit, int number) {
		return String.valueOf(number).contains(String.valueOf(digit));
	
			
}
	}