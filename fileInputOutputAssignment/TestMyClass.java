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

public class TestMyClass {

	private MyClass myClass;
	private ArrayList<MyClass> list;
	
	@Before
	public void setup(){
		MyClass myClassOne = new MyClass(103, "Ankita");
		MyClass myClassTwo = new MyClass(105,"Ankit");
		MyClass myClassThree = new MyClass(104,"Deepika");
		MyClass myClassFour = new MyClass(106,"Deepak");
		MyClass myClassFive = new MyClass(107,"ram");
		
		ArrayList<MyClass> list = new ArrayList();
		list.add(myClassOne);
		list.add(myClassTwo);
		list.add(myClassThree);
		list.add(myClassFour);
		list.add(myClassFive);
		//System.out.println(list);
	}

	@Test
	public void test() {
		String path = "C:/Ankita/InputOutput/myclass.txt";
		ArrayListWrite listWrite = new ArrayListWrite();


		try {
			listWrite.writeArrayInFile(path,list);
			//assertEquals()
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}
	
	@Test
	public void readArrayListFromFile(){
		String path = "C:/Ankita/InputOutput/myclass.txt";
		ArrayListWrite listWrite = new ArrayListWrite();
		try {
				listWrite.readArrayListFromFile(path);
				
			//assertEquals()
			System.out.println(myClass.toString());
		} catch (Exception e) {
			//e.printStackTrace();
		}

		

	}

}
