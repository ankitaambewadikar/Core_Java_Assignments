package dateAssignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForValidDateFormat {				//class to test given date is displayed in given format

	@Test
	public void testOneForValidEnteredDate() {
		Date dateStringOne = new Date(11,02,2018);
		String resultOne = dateStringOne.toString();
		assertEquals("11/2/2018",resultOne);
	}
	@Test
	public void testOneForInValidEnteredDate() {
		Date dateStringOne = new Date(11,02,2018);
		String resultOne = dateStringOne.toString();
		assertNotEquals("11-2/2018",resultOne);
	}
	

}
