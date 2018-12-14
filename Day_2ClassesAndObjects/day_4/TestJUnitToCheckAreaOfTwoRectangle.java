package day_4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnitToCheckAreaOfTwoRectangle {
	
	RectangleShape rectOne;
	RectangleShape rectTwo;
	@Before
	public void setUp(){
		rectOne = new RectangleShape(10,15);
		rectTwo = new RectangleShape(10,15);
	}

	@Test
	public void testToCheckAreaOfTwoRectanglesDifferentSizes() {
		
		rectOne = new RectangleShape(10, 15);
		rectTwo = new RectangleShape(10, 10);
		double areaOne = rectOne.toFindArea();
		double areaTwo = rectTwo.toFindArea();
		assertNotEquals(areaOne,areaTwo,0.02);
	}
	@Test
	public void testToCheckAreaWithSameSizes(){
		
		rectOne = new RectangleShape(10, 10);
		rectTwo = new RectangleShape(10, 10);
		double areaOne = rectOne.toFindArea();
		double areaTwo = rectTwo.toFindArea();
		assertEquals(areaOne,areaTwo,0.02);
		
	}
	@Test
	public void testToCheckArea(){
		
		rectOne = new RectangleShape(0, 5);
		rectTwo = new RectangleShape(10, 10);
		double areaOne = rectOne.toFindArea();
		double areaTwo = rectTwo.toFindArea();
		assertNotEquals(areaOne,areaTwo,0.02);
		
	}
	
}
