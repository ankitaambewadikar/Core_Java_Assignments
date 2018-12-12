/*
/*Program to find the missing element from the given array using JUnit.
*/
package day_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistinctArrayJUnitTest {
	
	private DistinctArray distinct;
	@Before															//
	public void setUp(){
		distinct = new DistinctArray();
	}

	@Test
	public void testDistinctArrayOne() {
		
		int numberArrayOne[] = {1,2,3,5,6,7};
		int resultOne = distinct.checkDistinctElement(numberArrayOne);
		assertEquals(4,resultOne);
	}
	@Test
	public void testDistinctArrayTwo(){
		
		int numberArrayTwo[] = {7,5,6,1,4,2};
		int resultTwo = distinct.checkDistinctElement(numberArrayTwo);
		assertEquals(3,resultTwo);
		
	}
	@Test
	public void testDistinctArrayThree(){
		int numberArrayThree[] = {5,3,1,2};
		int resultThree = distinct.checkDistinctElement(numberArrayThree);
		assertEquals(4,resultThree);
	}
	public void testDistinctEmptyArray(){
		int numberArrayFour[] ={};
		int resultFour = distinct.checkDistinctElement(numberArrayFour);
		assertEquals(0,resultFour);
	}
	public void testDistinctArrayFour(){
		int numberArrayFive[] = {3,1,0};
		int resultFive = distinct.checkDistinctElement(numberArrayFive);
		assertEquals(2,resultFive);
	}

}
