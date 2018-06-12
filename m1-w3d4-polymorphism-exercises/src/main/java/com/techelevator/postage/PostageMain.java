package com.techelevator.postage;

import java.util.Scanner;

public class PostageMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		while(true){
	        
		System.out.print("Please enter the weight of the package: ");
		int weightAmount = (int) (Double.parseDouble(in.nextLine()));
		System.out.print("(P)ounds or (O)unces?: ");
		String weightType = in.nextLine().toUpperCase();
		if (weightType.equals("O")) {
			weightAmount *= 16;
		}
		System.out.print("What distance will it be traveling?: ");
		int distanceTraveling = (int) (Double.parseDouble(in.nextLine()));
		System.out.println();
		System.out.format("%1s%23s\n", "Delivery Method", "$ cost");
		System.out.print("--------------------------------------");
		System.out.println();
		System.out.format("%1s%7s%1s\n", "Postal Service (1st Class)", "$", (new PostalService("1st Class").calculateRate(distanceTraveling, weightAmount)));
		System.out.format("%1s%7s%1s\n", "Postal Service (2nd Class)", "$", (new PostalService("2nd Class").calculateRate(distanceTraveling, weightAmount)));
		System.out.format("%1s%7s%1s\n", "Postal Service (3rd Class)", "$", (new PostalService("3nd Class").calculateRate(distanceTraveling, weightAmount)));
		System.out.format("%1s%28s%1s\n", "FexEd", "$", (new FexEd(20.00).calculateRate(distanceTraveling, weightAmount)));
		System.out.format("%1s%15s%1s\n", "SPU (4-day ground)", "$", (new SPU("four-day ground").calculateRate(distanceTraveling, weightAmount)));
		System.out.format("%1s%14s%1s\n", "SPU (2-day business)", "$", (new SPU("two-day business").calculateRate(distanceTraveling, weightAmount)));
		System.out.format("%1s%19s%1s\n", "SPU (next-day)", "$", (new SPU("next day").calculateRate(distanceTraveling, weightAmount)));
	}
	
}
}