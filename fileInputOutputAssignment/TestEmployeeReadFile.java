package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeReadFile {

	private Employee employee = null;
	private EmployeeWriteReadFile employeeReadWrite;
	@Before
	public void setup(){
		employeeReadWrite = new EmployeeWriteReadFile();
		
	}
	@Test
	public void testForReadFromFile(){
		String path = "C:/Ankita/InputOutput/employee.txt";

			try {
				employee =  employeeReadWrite.readFile(path);
				System.out.println(employee.toString());
				//assertEquals(Employee ["salary=5000.0, employeeName=Ankita, employeeId=166015",]

			} catch (Exception e) {
				//e.printStackTrace();
			}

		
		
	}
	
}
