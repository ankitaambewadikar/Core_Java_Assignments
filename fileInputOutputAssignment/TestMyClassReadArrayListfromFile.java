package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestMyClassReadArrayListfromFile {

	@Test
	public void readArrayListFromFile() {

		ArrayList<MyClass> myClass = new ArrayList();
		ArrayListWriteRead listWriteRead = new ArrayListWriteRead();
		String path = "C:/Ankita/InputOutput/neMyClass.txt";
		try {
			myClass = listWriteRead.readArrayListFromFile(path);
			System.out.println(myClass.toString());
		} catch (Exception e) {
			// e.printStackTrace();

		}

	}

}