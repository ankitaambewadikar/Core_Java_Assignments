package country;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCountry {

	private long largestPopulation;

	@Test
	public void test() {

		Country countries[] = new Country[4];
		countries[0] = new Country("India",1330000,3.27);
		countries[1] = new Country("USA", 320000, 9.8);
		countries[2] = new Country("China",1380000, 9.6);
		countries[3] = new Country("Russia", 250000, 6);
		
		double largestArea = 0;
		for(int counter = 0;counter < countries.length ; counter++){
			
			if(largestArea < countries[counter].getCountryArea()){
				largestArea = countries[counter].getCountryArea();
			}
			
		}
		System.out.println(largestArea);
		//assertEquals(9.8,largestArea,0.02);
		long largestpopulation;
		for(int counterTwo = 1;counterTwo < countries.length;counterTwo++){
			
			if(largestPopulation < countries[counterTwo].getCountryPopulation()){
				largestPopulation = countries[counterTwo].getCountryPopulation();
			}
			
		}
		
	}
	

}
