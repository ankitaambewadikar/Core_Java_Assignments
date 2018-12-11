import static org.junit.Assert.*;

import org.junit.Test;


public class FactorialJUnitTest {

	private HelloTest helloTest;
	@Test
	public void factorialOfPositiveNumber() {
		
		helloTest  = new HelloTest();
		int factorial = helloTest.factorialOfNumber(5);
		assertEquals(120, factorial);
	}

}
