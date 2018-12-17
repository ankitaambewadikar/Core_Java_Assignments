package country;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestForLargePopulation {
	
	private Country countries[] = new Country[4];
	@Before
	public void setUp(){
		countries[0] = new Country("India",1330000,3.27);
		countries[1] = new Country("USA", 320000, 9.8);
		countries[2] = new Country("China",1380000, 9.6);
		countries[3] = new Country("Russia", 250000, 6);
	}

	@Test
	public void testOneForLargestPopulation() {
		long largePopulation = 0;
		for(int counter = 0 ;counter < countries.length;counter++){
			
			if(largePopulation < countries[counter].getCountryPopulation()){
				largePopulation = countries[counter].getCountryPopulation();
			}
		}
		System.out.println(largePopulation);
		assertEquals(1380000,largePopulation);
	}
	@Test
	public void testTwoForLargestPopulation(){
		long largePopulation = 0;
		for(int counter = 0 ;counter < countries.length;counter++){
			
			if(largePopulation < countries[counter].getCountryPopulation()){
				largePopulation = countries[counter].getCountryPopulation();
			}
		}
		System.out.println(largePopulation);
		assertNotEquals(138000,largePopulation);
	}
	

}
