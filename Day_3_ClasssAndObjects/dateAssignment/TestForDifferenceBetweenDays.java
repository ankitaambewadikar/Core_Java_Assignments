package dateAssignment;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestForDifferenceBetweenDays {									//class to check the difference between dates

	@Test
	public void testOnetoCheckDateDifferenceWhenObjectTwoInvokedSmaller() {
		Date dateObjectOne = new Date(28,2,2018);
		Date dateObjectTwo = new Date(20,3,2010);
		//Date obj[] = new Date[2];
		//obj[0]=new Date(28,2,2018);
		//obj[1]=new Date(20,3,2010);
		
		int[] difference = dateObjectOne.getDifferenceInDate(dateObjectTwo);
		
		assertEquals(8,difference[0]);
		assertEquals(1,difference[1]);
		assertEquals(8,difference[2]);
			}
	@Test
	public void testTwotoCheckDateDifferenceWhenObjectTwoInvokedGreater() {
		Date dateObjectOne = new Date(28,2,2009);
		Date dateObjectTwo = new Date(20,9,2018);
		int[] difference = dateObjectOne.getDifferenceInDate(dateObjectTwo);
		assertEquals(8,difference[0]);
		assertEquals(7,difference[1]);
		assertEquals(9,difference[2]);
		
		
			}
	

}
