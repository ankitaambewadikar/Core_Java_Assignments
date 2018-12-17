package country;

public class Country {

	private String countryName;
	private long countryPopulation;
	private double countryArea;

	Country(String countryName, long countryPopulation, double countryArea) {
		
		this.countryName=countryName;
		this.countryPopulation = countryPopulation;
		this.countryArea = countryArea;
	}

	public void displayDetails() {
	
		System.out.println("Name :" + countryName);
		System.out.println("Population :" +countryPopulation + "crores");
		System.out.println("Area :" + countryArea + "MsqKm");
		
	}
	public String getCountryName(){
		return this.countryName;
		
	}
	public long getCountryPopulation(){
		return this.countryPopulation;
	}
	public double getCountryArea(){
		return this.countryArea = countryArea;
	}
	

	

}
