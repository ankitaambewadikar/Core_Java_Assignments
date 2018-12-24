package com.basicCollectionsAssignment;

public class Carscomparable  implements Comparable<Carscomparable>{
	private String make;
	private String model;
	private int year;
	private double price;

	public Carscomparable(String make, String model, int year, double price) {

		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public int compareTo(Carscomparable object) {
		
		Carscomparable car = (Carscomparable)object;
		System.out.println(this.year-car.year);
		return this.year-car.year ;
	}

}
