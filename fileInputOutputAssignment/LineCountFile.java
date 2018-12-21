package com.fileInputOutputAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LineCountFile {

	public int countLineInFile(String path) throws IOException {

		BufferedReader fileReader = new BufferedReader(new FileReader(path));
		int lines = 0;
		while(fileReader.readLine() != null)
		{
			lines++;
		}
		return lines;
		
	}
	

}
