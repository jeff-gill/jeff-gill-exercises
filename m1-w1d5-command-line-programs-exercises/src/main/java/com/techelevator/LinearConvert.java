package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Please enter a length: ");
		
		String lengthEntry = in.nextLine();
		
		System.out.print("Is the measurement in (m)eter or (f)eet? ");
				
		String choice = in.nextLine().toLowerCase();
		
		double amount = Double.parseDouble(lengthEntry);
		
		String outcome = "";
		
		
		switch(choice) {
			case "f":
				double mTotal = (amount * .3048);
				outcome = (lengthEntry + "f is %1.4f" + "m");
				System.out.printf(outcome,  mTotal);
				break;
			case "m":
				double fTotal = (amount * 3.2808399);
				outcome = (lengthEntry + "m is %1.4f" + "f");
				System.out.printf(outcome, fTotal);
				break;
	}
	}
}

