package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
/**
 * 
 * @author aambewad
 * Test class WordCount for testing the words present in the file
 *
 */
public class TestWordCountFileapplication {
/**
 * test to check no words present in file One
 * @throws IOException
 */
	@Test
	public void testOneForWorCountFromFile() throws IOException {
		WordCount wordCount = new WordCount();
		int actual = wordCount.countWordsInFile("C:/Ankita/InputOutput/wordCount.txt");
		assertEquals(93,actual);
	}
	/**
	 * test to check no words present in file Two
	 * @throws IOException
	 */
	@Test
	public void testTwoForWorCountFromFile() throws IOException {
		WordCount wordCount = new WordCount();
		int actual = wordCount.countWordsInFile("C:/Ankita/InputOutput/wordCountOne.txt");
		assertEquals(0,actual);
	}



}
