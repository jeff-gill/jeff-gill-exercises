package com.techelevator.calculator;

public class Calculator {

	//
	// Write code here
	//

	private int currentValue;

	public int getCurrentValue() {
		return currentValue;
	}

	public int add(int addend) {
		return currentValue += addend;

	}

	public int multiply(int multiplier) {
		return currentValue *= multiplier;
	}

	public int subtract(int subtrahend) {
		return currentValue -= subtrahend;
	}

	public int power(int exponent) {
		return currentValue = ((int) Math.pow((double) currentValue, (double) exponent));
	}

	public void reset() {
		this.currentValue = 0;
	}

}
