/*
 * Given a string, you need to reverse the order of characters in each word within
 *  a sentence while still preserving whitespace and initial word order.
 */
package day_2;

import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseStringJUnitTest {							 //JUnit Test class to test the cases

	@Test
	public void reverseStringTest() {
		ReverseString revString = new ReverseString();			//  reference of class created
		String reverse = revString.reverseString("Let's take LeetCode contest");
		assertEquals("  s'teL ekat edoCteeL tsetnoc",reverse);
	}

}

