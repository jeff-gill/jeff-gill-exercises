package com.techelevator.postage;

import java.util.Scanner;

public class PostageMain {

	private static final IDeliveryDriver[] carriers = new IDeliveryDriver[] { new FexEd(), new PostalService(null), new SPU(null)};

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		while(true){
	        
		System.out.print("Please enter the weight of the package: ");
		int weightAmount = (int) (Double.parseDouble(in.nextLine()));
		System.out.print("(P)ounds or (O)unces?: ");
		String weightType = in.nextLine().toUpperCase();
		System.out.print("What distance will it be traveling?: ");
		int distanceTraveling = (int) (Double.parseDouble(in.nextLine()));
		System.out.println();
		System.out.format("%1s%23s\n", "Delivery Method", "$ cost");
		System.out.print("--------------------------------------");
		System.out.println();
		System.out.format("%1s%7s%1s\n", "Postal Service (1st Class)", "$", (weightAmount * distanceTraveling)) ;
		System.out.format("%1s%7s%1s\n", "Postal Service (2nd Class)", "$", (weightAmount * distanceTraveling));
		System.out.format("%1s%7s%1s\n", "Postal Service (3rd Class)", "$", (weightAmount * distanceTraveling));
		System.out.format("%1s%28s%1s\n", "FexEd", "$", "hi");
		System.out.format("%1s%15s%1s\n", "SPU (4-day ground)", "$", "hi");
		System.out.format("%1s%14s%1s\n", "SPU (2-day business", "$", "hi");
		System.out.format("%1s%19s%1s\n", "SPU (next-day)", "$", "hi");
	}
	
}
}