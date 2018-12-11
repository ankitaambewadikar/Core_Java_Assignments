package day_2;

import static org.junit.Assert.*;								//import 

import org.junit.Test;


public class PalindromeJUnit {
		
	@Test														//test case 1 for checking palindrome of positive number
	public void checkPalindromeOfPositiveNumberTest() {
		Palindrome palindrome = new Palindrome();				
		boolean result = palindrome.checkPalindrome("121"); 	//storing the result in boolean datatype 
		assertTrue(result);										//assertTrue this checks if returned value is true
	}
	@Test
	public void checkPalindromeOfNegativeNumberTest() {			//test case 2 for checking palindrome for negative number
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.checkPalindrome("-121"); 
		assertFalse(result);
	}
	@Test
	public void checkPalindromeNumberTest() {					//test case3 for checking a two digit number
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.checkPalindrome("88"); 
		assertTrue(result);
	}

}

