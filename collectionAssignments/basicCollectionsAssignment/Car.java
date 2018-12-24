package com.basicCollectionsAssignment;

import java.util.Set;

public class Car {

	private String makeCompany;
	private String model;
	private int year;
	private double price;

	public Car(String makeCompany, String model, int year, double price) {
		this.makeCompany = makeCompany;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [makeCompany=" + makeCompany + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((makeCompany == null) ? 0 : makeCompany.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (makeCompany == null) {
			if (other.makeCompany != null)
				return false;
		} else if (!makeCompany.equals(other.makeCompany))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (year != other.year)
			return false;
		return true;
	}



	public void printAllAttributes(Set<Car> hashSetCar) {

		for(Car names : hashSetCar) {
			System.out.println(names);
		}
	}
	
	
}
