package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

/**
 * 
 * @author aambewad test class TestLineCountFileApplication to test the no of
 *         lines present in the file
 *
 */
public class TestLineCountFileApplication {

	/**
	 * testOneForLineCountApplication() method to count the lines in existing
	 * file
	 */
	@Test
	public void testOneForLineCountApplication() {

		LineCountFile object = new LineCountFile();

		try {
			int actual = object
					.countLineInFile("C:/Ankita/InputOutput/fileOne.txt");
			System.out.println(actual);
			assertEquals(8, actual);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * testTwoForLineCountApplication() method to countlines but check file
	 * exist before that
	 */
	@Test
	public void testTwoForLineCountApplicationFileExist() {

		LineCountFile object = new LineCountFile();

		try {
			int actual = object
					.countLineInFile("C:/Ankita/InputOutput/fileExist.txt");

		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("File Not Exist");
		}

	}
/**
 * testThreeForLineCountApplication() method to check lines in file
 */
	@Test
	public void testThreeForLineCountApplication() {

		LineCountFile object = new LineCountFile();

		try {
			int actual = object
					.countLineInFile("C:/Ankita/InputOutput/fileOne.txt");
			System.out.println(actual);
			assertNotEquals(9, actual);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
