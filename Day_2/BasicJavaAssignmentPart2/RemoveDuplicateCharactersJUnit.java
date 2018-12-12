/*
 * Program to remove duplicate characters from string 
 */
package day_2;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicateCharactersJUnit {

	private RemoveDuplicateCharacter removeDuplicateCharacter;
	@Before
	public void setUp(){
		
		removeDuplicateCharacter = new RemoveDuplicateCharacter();
	}
	@Test
	public void removeDuplicateCharactertestOne() {
		
		String resultOne = removeDuplicateCharacter.removeDuplicateSort("abcabcabc");
		assertEquals("abc",resultOne);
		
		
	}
	@Test
	public void removeDuplicateCharactertestTwo() {
		
		String resultTwo = removeDuplicateCharacter.removeDuplicateSort("javaforschool");
		assertEquals("javforschl",resultTwo);
		
		}
	@Test
	public void removeDuplicateCharactertestThree() {
		
		String resultThree = removeDuplicateCharacter.removeDuplicateSort("Mississippi");
		assertEquals("Misp",resultThree);
		
		}

}
