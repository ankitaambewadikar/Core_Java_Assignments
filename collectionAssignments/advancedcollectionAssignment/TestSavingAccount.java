package com.advancedcollectionAssignment;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author aambewad
 * Test SavingAccount class to test the arrylist where the savingAccount objects are added and saved in file
 *
 */
public class TestSavingAccount {
	private SavingAccount savingAccount;
	List<SavingAccount> savingAccountList = new ArrayList<>();
	
	@Before
	public void testForAddingSavingAccountObjectToArrayList() {
		
		savingAccountList.add(new SavingAccount(101,"Ankita",5000,true));
		savingAccountList.add(new SavingAccount(102,"Ankit",4000,true));
		savingAccountList.add(new SavingAccount(110,"deepika",3000,true));

	}
	/**
	 * path of file is given where the arraylist is to be written
	 */
	@Test
	public void testForWriteSavingAccountArrayListInFile(){
		
		SavingAccountReadWriteInfile infile = new SavingAccountReadWriteInfile();

		String path = "C:/Ankita/InputOutput/savingAccount.txt";
		try {
			infile.writeArrayListSavingAccountInFile(savingAccountList,path);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}

	

}
