package dateAssignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForDateIsSmaller {									//class to test wether the second date object send is small or not

	@Test
	public void testOneDateInvokedIsSmaller() {
		Date dateObjectOne = new Date(28,2,2018);
		Date dateObjectTwo = new Date(9, 2,2010);
		boolean isSmaller = dateObjectOne.isSmaller(dateObjectTwo);
		assertEquals(true,isSmaller);								// assert equlas to check boolean values

	
	}
	@Test
	public void testOneDateInvokedIsSmallerOrNot() {
		Date dateObjectOne = new Date(11,02,2009);
		Date dateObjectTwo = new Date(9, 2,2010);
		boolean isSmallerOne = dateObjectOne.isSmaller(dateObjectTwo);
		assertEquals(false,isSmallerOne);
	
	}
		

}
