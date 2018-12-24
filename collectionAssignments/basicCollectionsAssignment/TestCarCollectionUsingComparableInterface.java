package com.basicCollectionsAssignment;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * 
 * @author aambewad
 *
 */
public class TestCarCollectionUsingComparableInterface {

	@Test
	public void test() {
		Carscomparable carOne = new Carscomparable("Hyuandi","I20 Grand",2001,450000);
		Carscomparable carTwo = new Carscomparable("Renault","Duster",2004,800000);
		Carscomparable carThree = new Carscomparable("Hyuandi","Santro",2005,200000);
		Set <Carscomparable> carSet = new TreeSet<Carscomparable>();
		carSet.add(carOne);
		carSet.add(carTwo);
		carSet.add(carThree);
		}

}
