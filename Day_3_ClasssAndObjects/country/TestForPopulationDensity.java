package country;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestForPopulationDensity {
	private Country countries[] = new Country[4];
	@Before
	public void setUp(){
		countries[0] = new Country("India",1330,3.27);
		countries[1] = new Country("USA", 3200, 9.8);
		countries[2] = new Country("China",13800, 9.6);
		countries[3] = new Country("Russia", 2500, 6);
	}

	@Test
	public void testOneCorrectPopulationDensity() {
		
		double largePopulation = 0;
		for(int counter = 0 ;counter < countries.length;counter++){
			
			if(largePopulation < countries[counter].getCountryPopulation()/countries[counter].getCountryArea()){
				largePopulation = (countries[counter].getCountryPopulation()/countries[counter].getCountryArea());
			}
		}
		assertEquals(1437.5,largePopulation,0.02);
		
	}
	@Test
	public void testTwoCorrectPopulationDensity() {
		
		double largePopulation = 0;
		for(int counter = 0 ;counter < countries.length;counter++){
			
			if(largePopulation < countries[counter].getCountryPopulation()/countries[counter].getCountryArea()){
				largePopulation = (countries[counter].getCountryPopulation()/countries[counter].getCountryArea());
			}
		}
		assertNotEquals(143.5,largePopulation,0.02);
		
	}

}
