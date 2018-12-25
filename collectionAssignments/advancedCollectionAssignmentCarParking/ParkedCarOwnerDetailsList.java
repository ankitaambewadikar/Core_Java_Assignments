package com.advancedCollectionAssignmentCarParking;

import java.util.ArrayList;
import java.util.List;

public class ParkedCarOwnerDetailsList {

	private List<ParkedCarOwnerDetails> carList  = new ArrayList<ParkedCarOwnerDetails>();
	private static int token;
	public int addCarToParking(ParkedCarOwnerDetails carOne) {

		carList.add(carOne);
		return token+1;
		
		
	}

}
