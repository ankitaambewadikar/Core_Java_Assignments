package dateAssignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForCorrectDate {

	@Test
	public void testOneDateInvokedIsSmaller() {
		Date dateObjectOne = new Date(11,02,2018);
		Date dateObjectTwo = new Date(9, 2,2010);
		boolean isSmaller = dateObjectOne.isSmaller(dateObjectTwo);
		assertEquals(true,isSmaller);

	
	}
	@Test
	public void testOneDateInvokedIsSmallerOrNot() {
		Date dateObjectOne = new Date(11,02,2009);
		Date dateObjectTwo = new Date(9, 2,2010);
		boolean isSmallerOne = dateObjectOne.isSmaller(dateObjectTwo);
		assertEquals(false,isSmallerOne);
	
	}
		

}
