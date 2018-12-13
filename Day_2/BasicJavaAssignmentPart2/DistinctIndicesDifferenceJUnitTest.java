/*
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the 
array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 */
package day_2;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistinctIndicesDifferenceJUnitTest {					 //JUnit Test class to test the cases

	private DistinctIndiceDifference distinctIndiceDifference;		//  reference of class created
	@Before															// @Before as this runs before all the test cases	
	public void setUp(){
		distinctIndiceDifference = new DistinctIndiceDifference();
	}
	@Test
	public void distinctIndiceDifftest() {
		
		int[] arrayOne = {1,9,4,5,7,3,8,2,9};
		boolean result = distinctIndiceDifference.checkDifference(arrayOne,1,8,7);//sending the values of indice i and j and 
																					//expected difference and storing it in boolean variable
		assertTrue(result);
		
		
	}

}
