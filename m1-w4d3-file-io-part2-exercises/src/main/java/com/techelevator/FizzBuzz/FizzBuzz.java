package com.techelevator.FizzBuzz;

import java.io.PrintWriter;

public class FizzBuzz {

		private final static int FIZZABLE = 3;
		private final static int BUZZABLE = 5;
		private final static String FIZZ = "Fizz";
		private final static String BUZZ = "Buzz";

		public String fizzBuzz(int value) {
			try(PrintWriter writer = new PrintWriter(FizzBuzzFile)){
			for (int i = 0; i < 301; i++)
				if (isDivisibleBy(FIZZABLE, i) || containsDigit(FIZZABLE, i)) {
				writer.println(FIZZ);
				}
				else if (isDivisibleBy(BUZZABLE, i) || containsDigit(BUZZABLE, i)) {
				writer.println(BUZZ);
					}
				else if (isDivisibleBy(BUZZABLE, i) && isDivisibleBy(BUZZABLE, i)) {
				writer.println("FIZZBUZZ");
					}
			}

		}

		public boolean isDivisibleBy(int multiple, int number) {
			return number % multiple == 0;
		}

		private boolean containsDigit(int digit, int number) {
			return String.valueOf(number).contains(String.valueOf(digit));
		}
}
	