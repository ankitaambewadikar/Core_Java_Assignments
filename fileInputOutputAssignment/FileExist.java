package com.fileInputOutputAssignment;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExist {

	public boolean fileExist(String fileName) throws FileNotFoundException {
		
		File file = new File(fileName);
		if(file.exists()){
			return true;
		}
		else
			 throw new FileNotFoundException();
	}

}
