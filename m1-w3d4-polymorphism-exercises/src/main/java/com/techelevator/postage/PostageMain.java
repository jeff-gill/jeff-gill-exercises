package com.techelevator.postage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.print("Please enter the weight of the package: ");
			int weightAmount = (int) (Double.parseDouble(in.nextLine()));
			System.out.print("(P)ounds or (O)unces?: ");
			String weightType = in.nextLine().toUpperCase();
			if (weightType.equals("o")) {
				weightAmount *= 16;
			}
			System.out.print("What distance will it be traveling?: ");
			int distanceTraveling = (int) (Double.parseDouble(in.nextLine()));
			System.out.println();
			System.out.format("%1s%23s\n", "Delivery Method", "$ cost");
			System.out.print("--------------------------------------");
			System.out.println();

			List<IDeliveryDriver> deliveryCompanies = new ArrayList<IDeliveryDriver>();
			deliveryCompanies.add(new PostalService("1st Class"));
			deliveryCompanies.add(new PostalService("2nd Class"));
			deliveryCompanies.add(new PostalService("3rd Class"));
			deliveryCompanies.add(new FexEd());
			deliveryCompanies.add(new SPU("four-day ground"));
			deliveryCompanies.add(new SPU("two-day business"));
			deliveryCompanies.add(new SPU("next day"));

			for (IDeliveryDriver company : deliveryCompanies) {
				System.out.format("%1s%7s%1s\n", company.getCompanyName(), "$",
						(company.calculateRate(distanceTraveling, weightAmount)));
			}
			System.out.println();
		}

	}
}