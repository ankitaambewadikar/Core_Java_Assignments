package day_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistinctIndicesDifferenceJUnitTest {

	private DistinctIndiceDifference distinctIndiceDifference;
	@Before
	public void setUp(){
		distinctIndiceDifference = new DistinctIndiceDifference();
	}
	@Test
	public void distinctIndiceDifftest() {
		
		int[] arrayOne = {1,9,4,5,7,3,8,2,9};
		boolean result = distinctIndiceDifference.checkDifference(arrayOne,1,8,7);
		assertTrue(result);
		
		
	}

}
