package day_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringPalindromeJUnit {

	@Test
	public void checkStringPalindrometest() {
		StringPalindrome stringPalindrome = new StringPalindrome();
		String[] input = {"nitin","ankita","malyalam","deepika"};
		
		boolean result = stringPalindrome.checkPalindrome(input);
		//assertEquals();
	}

}
