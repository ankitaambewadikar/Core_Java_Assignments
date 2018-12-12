/*
 * Program to find element from multidimensional array
 */

package day_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiDimensionalArrayJUnitTest {

	private MultiDimensionalArray multiDimensionalArray;
	@Before
	public void setUp(){
		multiDimensionalArray = new MultiDimensionalArray();
	}
	@Test
	public void checkElememtTestOne() {
		
		int numberArray[][] ={
				{1,2,3},
                {4,5,6},
                {7,8,9}
		};
		int result = multiDimensionalArray.checkElement(numberArray,9);
		assertEquals(9,result);
		
	}
	/*
	@Test
	public void checkElementTestTwo(){
		
		int[][] numberArrayTwo ={
				{1,2,3,5,10},
				{6,9,8,7,12}
		};
		int resultTwo = multiDimensionalArray.checkElement(numberArrayTwo,3);
		assertEquals(3,resultTwo);
		
		
		}*/
	

}
