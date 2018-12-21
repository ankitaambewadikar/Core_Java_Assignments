package com.testTraining;
import static org.junit.Assert.*;

import org.junit.Test;

import com.training.CorporateTraining;
import com.training.PublicTraining;
import com.training.Training;

public class TestTraining {

	@Test
	public void testForPublicTrainingOrderValue() {							//test method for Checking the OrderValue of PublicTraining object
		
		Training publicTraining = new PublicTraining("JAVA",5000,51);		//Upcasting
		publicTraining.getOrderValue();
		publicTraining.toString();
		assertEquals(255000,publicTraining.getOrderValue(),0.0);
	}
	@Test
	public void testForCorporateTrainingOrderValue() {						//test method for Checking the OrderValue of corporateTraining object
		
		Training corporateTraining = new CorporateTraining("BigData",35000,5);
		corporateTraining.getOrderValue();
		corporateTraining.toString();
		assertEquals(175000,corporateTraining.getOrderValue(),0.0);
	}

}
	
	

