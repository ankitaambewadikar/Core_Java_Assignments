package distance;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistanceTestCases {

	private Distance distanceOne ;
	private Distance distanceTwo;
	private Distance distanceThree;
	
	@Before
	public void setUp(){
		distanceOne = new Distance();
		distanceTwo = new Distance();
		distanceThree = new Distance();
	}
	@Test
	public void testForGetFeet() {
		
		distanceOne.set(4,5);
		distanceOne.display();
		distanceTwo.set(3,5);
		distanceTwo.display();
		Distance result=distanceThree.add(distanceOne, distanceTwo);
		assertEquals(7,result.getFeet());
		
	}
	@Test
	public void testForGetInches() {
		
		distanceOne.set(4,9);
		distanceOne.display();
		distanceTwo.set(3,6);
		distanceTwo.display();
		Distance resultOne=distanceThree.add(distanceOne, distanceTwo);
		assertEquals(3,resultOne.getInches(),0.02);
		
	}
	

}
