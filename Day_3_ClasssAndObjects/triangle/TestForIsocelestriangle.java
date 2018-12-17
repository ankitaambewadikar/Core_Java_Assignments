package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForIsocelestriangle {

	@Test
	public void testOneForIsocelestriangle() {
		Triangle triangles = new Triangle(5,3,2);
		boolean isIsoceles= triangles.isIsocelesTriangle();
		assertEquals(false,isIsoceles);
	}
	@Test
	public void testtwoForIsocelestriangle() {
		Triangle triangles = new Triangle(5,4,4);
		boolean isIsoceles= triangles.isIsocelesTriangle();
		assertEquals(true,isIsoceles);
	}
}
