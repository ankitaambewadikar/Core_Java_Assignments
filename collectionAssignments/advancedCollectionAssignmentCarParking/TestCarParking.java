package com.advancedCollectionAssignmentCarParking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCarParking {

	private ParkedCarOwnerDetailsList parkedCar;
	private ParkedCarOwnerDetails carOne;
	private ParkedCarOwnerDetails carTwo;
	private ParkedCarOwnerDetails carThree;
	private ParkedCarOwnerDetails carFour;
	private ParkedCarOwnerDetails carFive;
	private ParkedCarOwnerDetails carSix;

	@Before
	public void setUp() {
		parkedCar = new ParkedCarOwnerDetailsList();
		carOne = new ParkedCarOwnerDetails("Ankita","Duster","MH 14 4539","8605389362","Pradhikaran");
		carTwo = new ParkedCarOwnerDetails("Ankit","Swift","MH 14 4500","8605387897","Pradhikaran-nigdi");
		carThree = new ParkedCarOwnerDetails("Deepika","Wagnor","MH 14 1239","7895389362","Pune");
		carFour = new ParkedCarOwnerDetails("Ram","Ritz","MH 14 5000","8607899362","Pimpri");
		carFive = new ParkedCarOwnerDetails("Ankita","HondaCity","MH 14 4009","8605389362","Airoli");
		//carSix = new ParkedCarOwnerDetails("Ankita","Duster","MH 14 4539","8605389362","Pradhikaran");
		}
	@Test
	public void testForAddNewCar(){
		int token = parkedCar.addCarToParking(carOne);
		
	}

}
