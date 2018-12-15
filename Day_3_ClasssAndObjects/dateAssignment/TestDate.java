package dateAssignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDate {

	@Test
	public void test() {
		Date dateObjectOne = new Date(11,02,2018);
		Date dateObjectTwo = new Date(9, 2,2010);
		String dateString = dateObjectOne.toString();
		System.out.println(dateString);
		
		boolean isSmaller = dateObjectOne.isSmaller(dateObjectTwo);
		System.out.println(isSmaller);
		
		int[] difference = dateObjectOne.getDifferenceInDate(dateObjectTwo);
		
		
	}

}
