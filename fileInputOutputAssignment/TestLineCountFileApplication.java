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

public class TestLineCountFileApplication {

	@Test
	public void testOneForLineCountApplication(){
		
		LineCountFile object = new LineCountFile();
	 
		try 
		{
			int actual = object.countLineInFile("C:/Ankita/InputOutput/fileOne.txt");
			System.out.println(actual);
			assertEquals(8,actual);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}
	@Test
	public void testTwoForLineCountApplication(){
		
		LineCountFile object = new LineCountFile();
	 
		try 
		{
			int actual = object.countLineInFile("C:/Ankita/InputOutput/fileExist.txt");
			
		} catch (IOException e)
		{
			//e.printStackTrace();
			System.out.println("File Not Exist");
		}

	}

}
