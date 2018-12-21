package com.fileInputOutputAssignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaGrepApplication {

	public String findStringInFile(String stringToFind, String path)
			throws IOException {
		BufferedReader fileReader = new BufferedReader(new FileReader(path));
		String line = " ";
		int lineNumber = 0;
		ArrayList stringList = new ArrayList();
		ArrayList lineNumberList = new ArrayList();

		while ((line = fileReader.readLine()) != null) {
				lineNumber++;
				String[] parts = line.split(" ");

				for (String word : parts) {
					if (word.equals(stringToFind)) {
						lineNumberList.add(line);
						stringList.add(lineNumber);
						}
				}
		}
		return " " + stringList + " " + lineNumberList;

	}
}
