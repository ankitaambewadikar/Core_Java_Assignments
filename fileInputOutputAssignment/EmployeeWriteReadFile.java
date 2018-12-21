package com.fileInputOutputAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeWriteReadFile {

	public void writeInFile(Employee employee, String path) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(path);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
		fileOutputStream.close();
	}

	public Employee readFile(String path) throws Exception {
		Employee employee = null;
		if (new File(path).exists()) {
			FileInputStream fileInputstream = new FileInputStream(path);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputstream);
			employee = (Employee) objectInputStream.readObject();
			fileInputstream.close();
			objectInputStream.close();
		} else if (!(new File(path).exists())) {
			throw new FileNotFoundException();
		} else
			throw new Exception();

		return employee;

	}

}
