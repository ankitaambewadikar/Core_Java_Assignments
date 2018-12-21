package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class TestJavaGrepApplication {

	@Test
	public void test() {
		JavaGrepApplication javaGrep = new JavaGrepApplication();

			try {
				String wordPrestString =javaGrep.findStringInFile("grep","C:/Ankita/InputOutput/wordCount.txt");
				System.out.println(wordPrestString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}

}
