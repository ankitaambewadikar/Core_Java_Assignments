package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForEquiteralTraingle {


	@Test
	public void testOneForEquilateraltriangle() {
		Triangle triangles = new Triangle(5,5,5);
		boolean isEquilateral= triangles.isEquilateralTriangle();
		assertEquals(true,isEquilateral);
	}
	@Test
	public void testtwoForEquilateraltriangle() {
		Triangle triangles = new Triangle(5,4,4);
		boolean isEquilateral= triangles.isEquilateralTriangle();
		assertEquals(false,isEquilateral);
	}
}


