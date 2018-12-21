package com.fileInputOutputAssignment;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeWriteFile {

	private Employee employee = null;
	private EmployeeWriteReadFile employeeReadWrite;
	@Before
	public void setup(){
		employeeReadWrite = new EmployeeWriteReadFile();
		employee = new Employee(166015,"Ankita",5000);
		
	}
	@Test
	public void testForWriteObjectInFile() {
		String path = "C:/Ankita/InputOutput/employee.txt";
		try {
			employeeReadWrite.writeInFile(employee,path);
		} catch (IOException e) {
			//e.printStackTrace();
		}
		

		}


}
