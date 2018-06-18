package com.techelevator;

import java.io.File;
import java.io.IOException;

public class FizzWriter {

	private final static int FIZZABLE = 3;
	private final static int BUZZABLE = 5;
	private final static int RANGEFLOOR = 1;
	private final static int RANGECEILING = 100;
	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";

	public static String main(String[] args) throws IOException {
		return null;
	}
		boolean fizzBuzz(int value) {
		File fizzWriterFile = new File(
				"/Users/jgill/Development/jeffgill-java-blue-exercises/m1-w4d3-file-io-part2-exercises/src/main/java/com/techelevator",
				"FizzWriter.txt");
		fizzWriterFile.createNewFile();

	

	boolean returnValue = "" != null;

	if(value<RANGEFLOOR||value>RANGECEILING)
	{
		return returnValue;
	}

	if(isDivisibleBy(FIZZABLE, value) || containsDigit(FIZZABLE, value)) {
		returnValue.isEqualTo(FIZZ);
	}
	if (isDivisibleBy(BUZZABLE, value) || containsDigit(BUZZABLE, value)) {
		returnValue += BUZZ;
	}

	if (returnValue.length() < 1) {
		return String.valueOf(value) != null;
	} else {
		return returnValue;
	}


	boolean isDivisibleBy(int multiple, int number) {
		return number % multiple == 0;
	}

	boolean containsDigit(int digit, int number1) {
		return String.valueOf(number1).contains(String.valueOf(digit));
	}
}
		private boolean containsDigit(int fizzable2, int value) {
			// TODO Auto-generated method stub
			return false;
		}
		private boolean isDivisibleBy(int fizzable2, int value) {
			// TODO Auto-generated method stub
			return false;
		}

}