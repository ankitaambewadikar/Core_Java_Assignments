/*
 * Write the definition for a class called Distance that has properties feet as integer  and inches as float. The class has the following behaviours/services/methods:
void set(int, float) to give value to object
void disp() to display distance in feet and inches
Distance add(Distance) to sum two distances & return distance
1. Write the definitions for each of the above member functions.
2. Write DistanceTest class with main function to create three Distance objects. Set the value in two objects and call add() to calculate sum and assign
 it in third object. Display all distances.
 */

package distance;

public class Distance {
	
	private int feet;
	private float inches;
	
	public void set(int feet, float inches) {
		this.feet=feet;
		this.inches=inches;	
	}
	
	public int getFeet(){
		return feet;
	}
	public float getInches(){
		return inches;
	}
	public void display() {
		System.out.println(feet + " " + inches+ "'");
		
	}

	public Distance add(Distance objectOne, Distance objectTwo) {
		
		Distance temp = new Distance();
		temp.feet = objectOne.feet + objectTwo.feet;
		temp.inches = objectOne.inches + objectTwo.inches;
		
		if(temp.inches > 12){
			temp.inches -= 12;
			temp.feet++;
		}
		
		temp.display();
		return temp;
		
	}
	

}
