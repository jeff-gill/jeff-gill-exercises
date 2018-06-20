package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	private final static int FIZZABLE = 3;
	private final static int BUZZABLE = 5;
	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";

	public static void main(String[] args) throws IOException, InterruptedException {

		File newFile = new File(
				"/Users/jgill/Development/jeffgill-java-blue-exercises/m1-w4d3-file-io-part2-exercises/src/main/java/com/techelevator",
				"FizzBuzz.txt");
		newFile.createNewFile();

		try (PrintWriter writer = new PrintWriter(newFile)) {
			for (int i = 1; i < 301; i++)
				if (isDivisibleBy(FIZZABLE, i) && isDivisibleBy(BUZZABLE, i)) {
					writer.println(FIZZ + BUZZ);
				} else if (isDivisibleBy(FIZZABLE, i) || containsDigit(FIZZABLE, i)) {
					writer.println(FIZZ);
				} else if (isDivisibleBy(BUZZABLE, i) || containsDigit(BUZZABLE, i)) {
					writer.println(BUZZ);
				} else {
					writer.println(i);
				}

		}

	}

	public static boolean isDivisibleBy(int multiple, int number) {
		return number % multiple == 0;
	}

	private static boolean containsDigit(int digit, int number) {
		return String.valueOf(number).contains(String.valueOf(digit));
	}
}
