/*
 * 
 */

package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void testOneForRightTriangle() {
	Triangle triangles = new Triangle(5,4,3);
	boolean isRight = triangles.isRightAngleTriangle();
	assertEquals(true,isRight);
	}

	@Test
	public void testTwoForRightTriangle() {
		Triangle triangles = new Triangle(5,4,6);
		boolean isRight = triangles.isRightAngleTriangle();
		assertEquals(false,isRight);
	}
}
