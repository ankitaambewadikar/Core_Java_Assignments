import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SubstractJUnitTest {

	private HelloTest helloTest;
	
	@Before
	public void setup(){
		helloTest = new HelloTest();
	}
	@Test
	public void substractTwoPositiveNumbers() {
		int difference = helloTest.substractTwoNumbers(50,24);
		assertEquals(26, difference);
	}
	@Test
	public void substractOneNegativeNumber() {
		int difference = helloTest.substractTwoNumbers(50,-25);
		assertEquals(75, difference);
	}
	@Test
	public void substractTwoNegativeNumbers() {
		int difference = helloTest.substractTwoNumbers(-50,-25);
		assertEquals(-25, difference);
	}
	@Test
	public void substractOneNegativeNumberFromZero() {
		int difference = helloTest.substractTwoNumbers(0,50);
		assertEquals(-50, difference);
	}
	
	
	
	

}
