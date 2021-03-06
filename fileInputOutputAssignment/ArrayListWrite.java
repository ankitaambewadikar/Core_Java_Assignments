package com.fileInputOutputAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListWrite {

	public void writeArrayInFile(String path, ArrayList<MyClass> list) throws Exception {
		
		FileOutputStream fileOutputStream = new FileOutputStream(path);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(list);
		objectOutputStream.close();
		fileOutputStream.close();
	}

	public MyClass readArrayListFromFile(String path) throws Exception {
		MyClass myClass = null;
		if (new File(path).exists()) {
			FileInputStream fileInputstream = new FileInputStream(path);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputstream);
			myClass = (MyClass) objectInputStream.readObject();
			fileInputstream.close();
			objectInputStream.close();
		} else if (!(new File(path).exists())) {
			throw new FileNotFoundException();
		} else
			throw new Exception();

		return myClass;
	}
	

}
