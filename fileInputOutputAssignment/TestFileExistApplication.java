package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class TestFileExistApplication {

	@Test
	public void testOneForNOFileExist() {
		FileExist fileExist = new FileExist();
		boolean exist;
		try {
			exist = fileExist.fileExist("C:/Ankita/InputOutput/fileExist.txt");
			assertEquals(false,exist);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File Not Exist");
		}
		
	}

	@Test
	public void testOneForFileExist() {
		FileExist fileExist = new FileExist();
		boolean exist;
		try {
			exist = fileExist.fileExist("C:/Ankita/InputOutput/fileOne.txt");
			assertEquals(true,exist);

		} catch (FileNotFoundException e) {
			//e.printStackTrace();
		}
		
	}

}
