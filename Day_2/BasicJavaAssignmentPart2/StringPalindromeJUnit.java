package day_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringPalindromeJUnit {

	@Test
	public void checkStringPalindrometest() {
		StringPalindrome stringPalindrome = new StringPalindrome();
		String[] input = {"nitin"};
		String[] checkList = {"nitin"};
		String[] inputlist = stringPalindrome.checkPalindrome(input);
		//assertEquals();
	}

}
