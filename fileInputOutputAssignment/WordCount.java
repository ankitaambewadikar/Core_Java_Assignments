
package com.fileInputOutputAssignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author aambewad
 * class WordCount to write logic to test the number of words present in file
 *
 */
public class WordCount {

	public int countWordsInFile(String path) throws IOException {
		
		int countWord = 0;
		BufferedReader fileReader = new BufferedReader(new FileReader(path));
		String line;
	       while (( line=fileReader.readLine()) != null) 
	       {
	    	   String []parts = line.split(" "); 
	    	   countWord += parts.length;           
	          }         
	       System.out.println(countWord);
	       return countWord;
	    }
	}


