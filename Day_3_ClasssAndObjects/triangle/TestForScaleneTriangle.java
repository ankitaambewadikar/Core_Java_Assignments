package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForScaleneTriangle {

	@Test
	public void testOneForScalenetriangle() {
		Triangle triangles = new Triangle(5,4,3);
		boolean isScalene= triangles.isScaleneTriangle();
		assertEquals(true,isScalene);
	}
	@Test
	public void testTwoForScalenetriangle() {
		Triangle triangles = new Triangle(5,4,4);
		boolean isScalene= triangles.isScaleneTriangle();
		assertEquals(false,isScalene);
	}


}
