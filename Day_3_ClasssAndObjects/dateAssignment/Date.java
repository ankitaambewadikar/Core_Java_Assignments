/*
 * Complete the implementation of the given Date class and test it by writing TestCases using JUnit:-
 */
package dateAssignment;

import java.lang.reflect.Array;

public class Date {
	
	private int day;										//data members to store values
	private int month;
	private int year;
	
	Date(int day, int month, int year) {					//constructor to initialize the objects
															//initialize d, m, y of the current object using the d, m, y parameters.

		if(month > 12){										//validate wether the date entered or set through constructor is valid or not
			System.out.println("enter valid month");
			
		}
		else if (month == 1 || month == 3 || month == 5 || month ==  7 || month ==  8 || month ==  10 || month == 12)
        {
			this.year=year;
			this.month=month;
			
            if (day <= 31)
            {   
                this.day = day;
            }
            else if (day >= 31)
            {
                System.out.println("Enter valid day");
            }
        }
		else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
			this.year=year;
			this.month=month;
            if (day <= 30)
            {
                this.day=day;
            }
            else if (day >= 30)
            {
               System.out.println("Enter valid day");
            }

         }
		 else if (month == 2) // February check
         {
			 	this.month = month;
			 	if (year % 4 == 0) // Leap year check for February
			 	{
			 		this.year = year;
			 		if (day <= 29)
			 		{
			 			this.day=day;
			 		}
			 	}	
                else if (day >= 29)
                {
                    System.out.println("enter valid day");
                }
                else if (year % 4 != 0)
                {
               	 		this.year=year;
               	
               	 		if (day <= 28)
               	 		{
               	 			this.day = day;
               	 		}
               	 		else if (day >= 28)
               	 		{
               	 			System.out.println("enter valid date");
               	 		}
                 }
            }
        
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
		difference[0] = (dateObjectTwo.day < day) ? (day - dateObjectTwo.day) : (dateObjectTwo.day - day);
		difference[1] = (dateObjectTwo.month < month) ? (month - dateObjectTwo.month) : (dateObjectTwo.month -month);
		difference[2] = (dateObjectTwo.year < year) ? (year - dateObjectTwo.year) : (dateObjectTwo.year - year);

		//System.out.println(difference[0]);
		return difference;
	}
	
	
	
}
