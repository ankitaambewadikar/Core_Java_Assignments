import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class MultiplyJUnitTest {

private HelloTest helloTest;
	
	@Before
	public void setup(){
		helloTest = new HelloTest();
	}
	@Test
	public void multiplyTwoPositiveNumbers() {
		
		int multiplication = helloTest.multiplyTwoNumbers(10,5);
		assertEquals(50, multiplication);
		
	}
	@Test
	@Ignore
	public void multiplyTwoNegativeNumbers() {
		
		int multiplication = helloTest.multiplyTwoNumbers(-10,-5);
		assertEquals(50, multiplication);
		
	}
	@Test
	public void multiplyOnePositiveAndOneNegativeNumber() {
		
		int multiplication = helloTest.multiplyTwoNumbers(-10,5);
		assertEquals(-50, multiplication);
		
	}

}
