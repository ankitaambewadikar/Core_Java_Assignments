/*
 * Program to find the name from array of names and return the occurence of that name in the array
 */

package day_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FindStringOccurenceJUnitTest {								 //JUnit Test class to test the cases
	
	private StringOccurence occurence;									//  refercnce of class created
	@Before																// @Before as this runs before all the test cases	
	public void setUp(){
		occurence = new StringOccurence();
	}
	@Test
	public void testFindOccurenceOfName() {								//test case for multiple occurence of string
		
		
		String[] namesOne = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		int occur = occurence.checkString(namesOne, "Sam");
		assertEquals(2,occur);
		
	}
	@Test
	public void testFindOccurence(){									//test case for single occurence
		String[] namesTwo = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		int occurThree = occurence.checkString(namesTwo, "Davis");
		assertEquals(1,occurThree);
	}
	
	@Test
	public void testFindOccurenceForEmptyString(){						//test case for empty string
		
		String[] name ={};
		int OccurTwo = occurence.checkString(name, "Ann");
		assertEquals(0,OccurTwo);
		
		
	}

}
