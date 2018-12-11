import static org.junit.Assert.*;

import org.junit.Test;


public class DivideJUnitTest {

	private HelloTest helloTest;
	@Test
	public void divideTwoPositiveNumbers() {
		
		helloTest = new HelloTest();
		int division = helloTest.divideTwoNumbers(10,2);
		assertEquals(5, division);
	}
	@Test
	public void divideTwoNegativeNumbers() {
		
		helloTest = new HelloTest();
		int division = helloTest.divideTwoNumbers(-10,-2);
		assertEquals(5, division);
	}
	@Test
	public void divideOnePositiveOneNegative() {
		
		helloTest = new HelloTest();
		int division = helloTest.divideTwoNumbers(10,-2);
		assertEquals(-5, division);
	}
}
