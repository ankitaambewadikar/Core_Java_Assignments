package day_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringPalindromeJUnit {									 //JUnit Test class to test the cases

	@Test
	public void checkStringPalindrometest() {
		StringPalindrome palindrome = new StringPalindrome();
		String input = ("malayalam");
		boolean result = palindrome.checkPalindrome(input);
		assertTrue(result);
	}

}
