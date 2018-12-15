package complex;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnitForComplexNumbers {
	
	private Complex complexOne = new Complex();
	private Complex complexTwo = new Complex();
	private Complex complexThree = new Complex();
	
	@Test
	public void main() {								//ComplexTest class with main function to create three complex number objects
		
		complexOne.setData(5,4);
		complexOne.display();
		complexTwo.setData(5,-5);
		complexTwo.display();
		complexThree.sumation(complexOne,complexTwo);	//adding two object values
		
		}

}
