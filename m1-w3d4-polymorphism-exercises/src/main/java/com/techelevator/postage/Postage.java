package com.techelevator.postage;

public class Postage {

	private String name;
	private int weight;
	private int distance;
	private String shippingClass;
	
	public Postage(String name, int weight, int distance, String shippingClass) {
		this.name = name;
		this.weight = weight;
		this.distance = distance;
		this.shippingClass = shippingClass;
	}


	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getDistance() {
		return distance;
	}

	public String getShippingClass() {
		return shippingClass;
	}
	
	
}
