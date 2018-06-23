package com.techelevator.vehicle_old;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.postage.FexEd;
import com.techelevator.postage.IDeliveryDriver;
import com.techelevator.postage.PostalService;
import com.techelevator.postage.SPU;

public class VehicleMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("What is the distance in miles you will be traveling?: ");
			int distanceTraveling = (int) (Double.parseDouble(in.nextLine()));
			System.out.println("Are you driving a truck, car or tank? :");
			String vehicleType = in.nextLine().toUpperCase();
			if (vehicleType == "CAR") {
				System.out.println("Does it have a trailer, Yes or No?");
				String trailerStatus = in.nextLine().toUpperCase();
			}
			if (vehicleType == "Truck") {
				System.out.println("How many axels does your truck have?");
				String trailerStatus = in.nextLine().toUpperCase();
			}
			if (vehicleType == "TANK") {
				System.out.println("Where on earth did you find a tank? No need to ans wer.Carry on.");
			
			System.out.println();
			
			List<IVehicle> differentVehicles = new ArrayList<IVehicle>();
			differentVehicles.add(new Car("NO"));
			differentVehicles.add(new Car("YES"));
			differentVehicles.add(new Truck("2-3 axels"));
			differentVehicles.add(new Truck("4-5 axels"));
			differentVehicles.add(new Truck("6-7 axels"));
			differentVehicles.add(new Truck("8 or more axels"));
			differentVehicles.add(new Tank("plain old tank"));

			for (IDeliveryDriver company : deliveryCompanies) {
				System.out.format("%1s%7s%1s\n", company.getCompanyName(), "$",
						(company.calculateRate(distanceTraveling, weightAmount)));
			}
			System.out.println();
		}
		}

	}

}
