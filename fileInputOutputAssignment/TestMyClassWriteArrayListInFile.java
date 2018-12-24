/**
 * 
 */

package com.fileInputOutputAssignment;
/**
 * 
 */

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestMyClassWriteArrayListInFile {

	ArrayList<MyClass> list = new ArrayList();
	
	@Before
	public void setup(){
		MyClass myClassOne = new MyClass(103, "Ankita");
		MyClass myClassTwo = new MyClass(105,"Ankit");
		MyClass myClassThree = new MyClass(104,"Deepika");
		MyClass myClassFour = new MyClass(106,"Deepak");
		MyClass myClassFive = new MyClass(107,"ram");
		
		list.add(myClassOne);
		list.add(myClassTwo);
		list.add(myClassThree);
		list.add(myClassFour);
		list.add(myClassFive);

	}

	@Test
	public void testForWriteListInFile() {
		String path = "C:/Ankita/InputOutput/neMyClass.txt";
		ArrayListWriteRead listWrite = new ArrayListWriteRead();
		try {
				listWrite.writeArrayInFile(path,list);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	

}


