package dateAssignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDate {

	@Test
	public void main() {												// main method where all the method vaules are set and checked
		Date dateObjectOne = new Date(28,2,2017);
		Date dateObjectTwo = new Date(9, 2,2018);
		String dateString = dateObjectOne.toString();
		System.out.println(dateString);
		
		boolean isSmaller = dateObjectOne.isSmaller(dateObjectTwo);
		System.out.println(isSmaller);
		
		int[] difference = dateObjectOne.getDifferenceInDate(dateObjectTwo);
		
		
	}

}
