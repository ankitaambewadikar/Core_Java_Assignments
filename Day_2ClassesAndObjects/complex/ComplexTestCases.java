/*
 * test class to test the addition of complex object and different test cases for getReal() value and getImaginary value
 */

package complex;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplexTestCases {
	
	private Complex complexOne;
	private Complex complexTwo;
	private Complex complexThree;
	
	@Before
	public void setUp(){
			complexOne = new Complex();
			complexTwo = new Complex();
			complexThree = new Complex();
	}

	@Test
	public void testForBothPositiveRealValue() {
		

		complexOne.setData(5,4);
		complexOne.display();
		complexTwo.setData(4, 3);
		complexTwo.display();
		Complex result = complexThree.sumation(complexOne, complexTwo);
		assertEquals(9,result.getReal(),0.02);							//assert for testing the real value of complex numbers
		
	}
	@Test
	public void testForBothPositiveImaginaryValue() {
		

		complexOne.setData(5,4);
		complexOne.display();
		complexTwo.setData(4, 3);
		complexTwo.display();
		Complex result = complexThree.sumation(complexOne, complexTwo);
		assertEquals(7,result.getImaginary(),0.02);						//assert for testing the imaginary value
		
	}
	@Test
	public void testForBothNegativeRealValue() {
		

		complexOne.setData(-5,-4);
		complexOne.display();
		complexTwo.setData(-4,-3);
		complexTwo.display();
		Complex result = complexThree.sumation(complexOne, complexTwo);
		assertEquals(-9,result.getReal(),0.02);
		
	}
	@Test
	public void testForBothNegativeImaginaryValue() {
		

		complexOne.setData(-5,-4);
		complexOne.display();
		complexTwo.setData(-4,-3);
		complexTwo.display();
		Complex result = complexThree.sumation(complexOne, complexTwo);
		assertEquals(-7,result.getImaginary(),0.02);
		
	}
	

}
