package com.basicCollectionsAssignment;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

/**
 * 
 * @author aambewad Test class to test the Collection classes
 */
public class TestCollections {

	private Car car;

	@Test
	public void testForLaptop() {

		Set<Laptop> hashSetLaptop = new HashSet();
		hashSetLaptop.add(new Laptop("HP", 109, "Windows-OS", "64-bit"));
		hashSetLaptop.add(new Laptop("DELL", 109, "Linux-OS", "32-bit"));
		hashSetLaptop.add(new Laptop("Apple", 235, "macOS", "64-bit"));
		hashSetLaptop.add(new Laptop("HP", 109, "mac-OS", "32-bit"));
		System.out.println(hashSetLaptop.toString());
		System.out.println(hashSetLaptop.equals(hashSetLaptop));
		// assertEquals(new HashSet<Laptop>(hashSetLaptop), new
		// HashSet<Laptop>(result.getCustomAttributes()));

	}

	@Test
	public void testForTelevisionSet() {

		Set<Television> hashSetTelevision = new HashSet<>();
		hashSetTelevision.add(new Television("LG", "Plasma", true, 65000));
		hashSetTelevision.add(new Television("Videocon", "LED", false, 35000));
		hashSetTelevision.add(new Television("Samsung", "Lcd", false, 30000));
		System.out.println(hashSetTelevision.toString());

		/*
		 * assertEquals(
		 * "[Television [company=Videocon, type=LED, enabled3D=false, price=35000.0], Television [company=Samsung, type=Lcd, enabled3D=false, price=30000.0], Television [company=LG, type=Plasma, enabled3D=true, price=65000.0]]\r\n"
		 * + "",result);
		 */
	}

	@Test
	public void testForCellPhone() {

		Set<CellPhone> hashSetCellPhone = new HashSet<>();
		hashSetCellPhone.add(new CellPhone("Vivo", "Y51L",
				"Internal memory-16Gb available", "Anroid V-Lollipop", 12000));
		hashSetCellPhone.add(new CellPhone("Oppo", "F68",
				"Internal memory-32Gb available", "Anroid V-Lollipop", 32000));
		hashSetCellPhone.add(new CellPhone("MI", "5Pro",
				"Internal memory-62Gb available", "Anroid V-Lollipop", 16000));
		hashSetCellPhone.toString();

	}

	@Test
	public void testForSchool() {

		Set<School> hashSetSchool = new HashSet();
		hashSetSchool.add(new School("CMS", "Pimpri-Chinichwad", "Pune", 5));
		hashSetSchool.add(new School("Ursula's", "Pimpri-Chinichwad", "Pune",
				10));
		hashSetSchool.add(new School("NMV", "Pune", "Pune", 1));
		hashSetSchool.add(new School("CMS", "Pimpri-Chinichwad", "Pune", 5));
		hashSetSchool.toString();

	}

	@Test
	public void testForCar() {

		Set<Car> hashSetCar = new HashSet();
		hashSetCar.add(new Car("Hyuandi", "I20 Grand", 2016, 450000));
		hashSetCar.add(new Car("Renault", "Duster", 2014, 800000));
		hashSetCar.add(new Car("Hyuandi", "Santro", 2005, 200000));
		hashSetCar.add(new Car("Hyuandi", "I20 Grand", 2016, 450000));

		System.out.println(hashSetCar.toString());
		//car.printAllAttributes(hashSetCar);

	}
}
