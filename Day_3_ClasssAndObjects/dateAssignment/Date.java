package dateAssignment;

import java.lang.reflect.Array;

public class Date {
	private int day;										//data members to store values
	private int month;
	private int year;
	
	Date(int day, int month, int year) {					//constructor to initialize the objects
															//initialize d, m, y of the current object using the d, m, y parameters.
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString(){								//return the value of a Date object as a String in d/m/y format.
		
		return (day + "/" + month + "/" + year);
		}
	
	public boolean isSmaller(Date dateObject2) {			//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
		
		if(dateObject2.year < year){
				return true;
		}
		else if(dateObject2.year == year){
			if(dateObject2.month < month){
				return true;
			}
			else if(dateObject2.month == month){
				if(dateObject2.day < day){
					return true;
				}
				
			}
				
		}
		return false;
		
		}
	public int[] getDifferenceInDate(Date dateObjectTwo) {
		
		int[] difference = new int[3];
		difference[0] = (dateObjectTwo.year < year) ? (year - dateObjectTwo.year) : (dateObjectTwo.year - year);
		difference[1] = (dateObjectTwo.month < month) ? (month - dateObjectTwo.month) : (dateObjectTwo.month -month);
		difference[2] = (dateObjectTwo.day < day) ? (day - dateObjectTwo.day) : (dateObjectTwo.day - day);
		//System.out.println(difference[0]);
		return difference;
	}
	
	
	
}
