package country;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestForLargeCountryArea {

	private Country countries[] = new Country[4];
	@Before
	public void setUp(){
		countries[0] = new Country("India",1330,3.27);
		countries[1] = new Country("USA", 32000, 9.8);
		countries[2] = new Country("China",13800, 9.6);
		countries[3] = new Country("Russia", 250000, 6);
	}
	@Test
	public void testOneForLargestArea() {
		double largestArea = 0;
		for(int counter = 0;counter < countries.length ; counter++){
			
			if(largestArea < countries[counter].getCountryArea()){
				largestArea = countries[counter].getCountryArea();
			}
			
		}
		System.out.println(largestArea);
		assertEquals(9.8,largestArea,0.02);
		
	}
	@Test
	public void testTwoForLargestArea() {
		double largestArea = 0;
		for(int counter = 0;counter < countries.length ; counter++){
			
			if(largestArea < countries[counter].getCountryArea()){
				largestArea = countries[counter].getCountryArea();
			}
			
		}
		assertNotEquals(9.6,largestArea,0.02);
		
	}
	

}
