package day_4;

public class RectangleShape {

	private double length, breadth;
	RectangleShape(double length, double breadth)
	{
		this.length = length;
		this.breadth= breadth;
		
	}
	public double toFindArea(   ) {
		
		if(length < 0 || breadth < 0){
			return 0;
			
		}
		else {
			double areaOne = length*breadth;
			return areaOne;
		}
	

	}
	

}
