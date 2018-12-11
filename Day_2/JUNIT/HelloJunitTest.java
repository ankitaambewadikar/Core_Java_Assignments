import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HelloJunitTest {
	
	private HelloTest helloTest;
	@Before
	public void setUp(){
		helloTest = new HelloTest();
	}

	@Test
	public void addTwoPositiveNumbersTest() {
		
		//HelloTest helloTest = new HelloTest();
		int answer = helloTest.addTwoNumbers(50,50);
		assertEquals(100, answer);;
	}
	@Test
	public void addTwoNegativeNumbersTest() {
		
		//HelloTest helloTest = new HelloTest();
		int answer = helloTest.addTwoNumbers(-50,-50);
		assertEquals(-100, answer);;
	}
	@Test
	public void addOneNegativeNumberTest() {
		
		//HelloTest helloTest = new HelloTest();
		int answer = helloTest.addTwoNumbers(50,-50);
		assertEquals(0, answer);;
	}
	@Test
	public void addTwoZerosTest() {
		
		//HelloTest helloTest = new HelloTest();
		int answer = helloTest.addTwoNumbers(0,0);
		assertEquals(0, answer);;
	}
	@Test
	public void addOneZeroTest() {
		
		//HelloTest helloTest = new HelloTest();
		int answer = helloTest.addTwoNumbers(0,50);
		assertEquals(50, answer);
	}
	
	



}
