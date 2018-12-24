package com.fileInputOutputAssignment;

import java.io.File;
import java.io.FileNotFoundException;
/**
 * 
 * @author aambewad
 * Class FileExist to check file exist at the path entered by the user
 */
public class FileExist {
/**
 * 
 * @param fileName
 * @return
 * @throws FileNotFoundException
 * method throws exception so as the file present or not at given location
 * file.exists() is used to find file present or not
 */
	public boolean fileExist(String fileName) throws FileNotFoundException {
		
		File file = new File(fileName);
		if(file.exists()){							
			return true;
		}
		else
			 throw new FileNotFoundException();
	}

}
