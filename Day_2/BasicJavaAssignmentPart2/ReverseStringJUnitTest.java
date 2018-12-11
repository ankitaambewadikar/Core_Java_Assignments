package day_2;

import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseStringJUnitTest {

	@Test
	public void reverseStringTest() {
		ReverseString revString = new ReverseString();
		String reverse = revString.reverseString("Let's take LeetCode contest");
		assertEquals("  s'teL ekat edoCteeL tsetnoc",reverse);
	}

}

