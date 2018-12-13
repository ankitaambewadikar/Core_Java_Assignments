/*
 * Write a program to remove the blank spaces from the input string and also take input from the user 
 * the word to be deleted from and position of word too. 
*/
package day_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReduceExtraBlankSpaceJUnitTest {              //JUnit Test class to test the cases 

	private ReduceExtraBlankSpace blankSpace;				//  reference of class created
	@Before													// @Before as this runs before all the test cases								
	public void setUp(){				
		blankSpace= new ReduceExtraBlankSpace();		
	}
	@Test
	public void checkBlankSpaceTest() {						
		
		String input = "  A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.";
		String result = blankSpace.checkBlankSpace(input,"IS",6);
		

	}
	/*@Test
	public void removeWordAtPosition(){
		
	}*/

}
