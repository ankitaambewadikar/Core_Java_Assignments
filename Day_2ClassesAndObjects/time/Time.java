/*
 * 
Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
void setTime(int, int) to set the specified value in object
void showTime() to display time object
time sum(time) to sum two time object & return time
1. Write the definitions for each of the above member functions.
2. Write main function to create three time objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all time objects.
 */

package time;

public class Time {
	private int hour;
	private int minute;

	public void set(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;	
		
	}

	public void display() {
		System.out.println(hour + ":" +minute);
		
		
	}

	public Time addTime(Time timeOne, Time timeTwo) {
		
		Time temp = new Time();
		temp.hour = timeOne.hour + timeTwo.hour;
		temp.minute = timeOne.minute + timeTwo.minute;
		
		if(temp.minute > 60 ){
			temp.minute = temp.minute - 60;
			temp.hour++;
			}
		if(temp.hour > 24 ){
			temp.hour = temp.hour - 24;
		}
		temp.display();
		return temp;
		
	}

	public int getHour() {
		
		return hour;
	}

	public int getMinute() {
		
		return minute;
	}
	

}
