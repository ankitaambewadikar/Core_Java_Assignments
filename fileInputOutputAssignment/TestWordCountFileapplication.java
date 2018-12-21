package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestWordCountFileapplication {

	@Test
	public void testOneForWorCountFromFile() throws IOException {
		WordCount wordCount = new WordCount();
		int actual = wordCount.countWordsInFile("C:/Ankita/InputOutput/wordCount.txt");
		assertEquals(93,actual);
	}
	/*@Test
	public void testTwoForWorCountFromFile() throws IOException {
		WordCount wordCount = new WordCount();
		int actual = wordCount.countWordsInFile("C:/Ankita/InputOutput/fileCount.txt");
		System.out.println("filenotFound");
		//assertEquals(9,actual);
	}*/


}
