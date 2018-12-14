/*Consider a Rectangle Shape.
Identify its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly.
If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.

Test the Program with different combinations test cases possible.
*/

package day_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForRectangleShape {
	
	private RectangleShape rectangleShape ;

	public void setUp()
	{
	
		rectangleShape  = new RectangleShape(20,30);
	}
	

	
	@Test
	public void findRectangleAreaOnetestPositiveLengthBreadth() 
	{
		rectangleShape  = new RectangleShape(20,30);
		double areaRectangleOne = rectangleShape.toFindArea();
		assertEquals(600,areaRectangleOne,0.02);	
	}
	
	@Test
	public void findRectangleAreaTestTwoNegativeLengthBreadth()
	{
		rectangleShape  = new RectangleShape(-20,-30);
		double areaRectangleTwo = rectangleShape.toFindArea( );
		assertEquals(0,areaRectangleTwo,0.02);
	}
	@Test
	public void findRectagleAreaTestThreeNegativeLengthPositiveBreadth()
	{
		rectangleShape  = new RectangleShape(-20,30);
		double areaRectangleThree = rectangleShape.toFindArea( );
		assertEquals(0,areaRectangleThree,0.02);
	}
	
	@Test 
	public void findRectagleAreaTestOneFieldZero()
	{
		rectangleShape  = new RectangleShape(0,0);
		double areaRectangleThree = rectangleShape.toFindArea( );
		assertEquals(0,areaRectangleThree,0.02);
	}
	
	

}
