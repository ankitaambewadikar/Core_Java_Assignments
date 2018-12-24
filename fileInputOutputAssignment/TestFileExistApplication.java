package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;
/**
 * 
 * @author aambewad
 *Test class testFileExistApplication to check whether given path of file ,at that path files exists or not
 */
public class TestFileExistApplication {
	
/**
 * testOneForNOFileExist test method for to check file not present at path
 */
	@Test
	public void testOneForNOFileExist() {
		FileExist fileExist = new FileExist();
		boolean exist;
		try {
			exist = fileExist.fileExist("C:/Ankita/InputOutput/fileExist.txt");
			assertEquals(false,exist);										  //assertEquals to compare the file exist or not
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File Not Exist");
		}
		
	}
	/**
	 * testOneForFileExist test method for to check existing file by giving file path 
	 */

	@Test
	public void testOneForFileExist() {
		FileExist fileExist = new FileExist();
		boolean exist;
		try {
			exist = fileExist.fileExist("C:/Ankita/InputOutput/fileOne.txt");
			assertEquals(true,exist);                                       //assertEquals to compare the file exist or not

		} catch (FileNotFoundException e) {
			//e.printStackTrace();
		}
		
	}

}
