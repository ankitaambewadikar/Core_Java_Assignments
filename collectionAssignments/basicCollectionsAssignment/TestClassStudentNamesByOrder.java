package com.basicCollectionsAssignment;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestClassStudentNamesByOrder {

	@Test
	public void test() {
		StudentNamesByorder studentObject = new StudentNamesByorder();
		List<String> students = new ArrayList();
		students.add("Sameer");
		students.add("Ankita");
		students.add("Ram");
		students.add("Deepika");
		students.add("Rubel");
		students.add("Ankita");
		students.add("Deepika");


		String actual =studentObject.printArrayElements(students);
		//assertEquals(students,actual);
		studentObject.sortArrayList(students);
		//assertEquals(students);
		
	
	}

}
