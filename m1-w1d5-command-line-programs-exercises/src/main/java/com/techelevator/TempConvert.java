package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Please enter a temperature: ");
		
		String tempEntry = in.nextLine();
		
		System.out.print("Is the temperature (C)elcius, or (F)arenheit? ");
		
		String choice = in.nextLine().toUpperCase();
	
		double amount = Double.parseDouble(tempEntry);
		
		String outcome = "";
		
		
		switch(choice) {
			case "F":
				double cTotal = ((amount - 32) / 1.8);
				outcome = (tempEntry + "F is %1.1f" + "C");
				System.out.printf(outcome, cTotal);
				break;
	
			case "C":
				double fTotal = ((amount * 1.8) + 32);
				outcome = (tempEntry + "C is %1.1f" + "F ");
			System.out.printf(outcome, fTotal);
			break;
		}
	
	}
}
		