package com.advancedcollectionAssignmentSavingAccount;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/**
 * 
 * @author aambewad
 *Test class to read the SavingAccount ArrayList from the file ,where the file path is sent to method readSavingAccountListFromFile()
 */
public class TestSavingAccountReadFile {

	@Test
	public void test() {
		List<SavingAccount> savingAccountLists = new ArrayList<SavingAccount>();
		SavingAccountReadWriteInfile readfile = new SavingAccountReadWriteInfile();

		String path = "C:\\Ankita\\InputOutput\\savingAccount.txt";
		try {
			 savingAccountLists = readfile.readSavingAccountListFromFile(path);
			 System.out.println(savingAccountLists);
		} catch (Exception e) {
			// e.printStackTrace();
		}
		

	}

}
