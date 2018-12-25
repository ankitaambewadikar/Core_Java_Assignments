package com.advancedcollectionAssignmentSavingAccount;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
/**
 * 
 * @author aambewad
 *here the SavingAccount objects are added in TreeSet and its sortion order is checked
 */
public class TestBankAccountList {

	@Test
	public void testForBankAccountListClassMaintainSavingAccountList() {
		List<SavingAccount> savingAccountList = new ArrayList<>();

		savingAccountList.add(new SavingAccount(110,"Ankita",5000,true));
		savingAccountList.add(new SavingAccount(101,"Ankit",4000,true));
		savingAccountList.add(new SavingAccount(102,"deepika",3000,true));
		savingAccountList.add(new SavingAccount(110,"Ankita",5000,true));

		Set<SavingAccount> listSet = new TreeSet<>(savingAccountList);
		System.out.println(listSet);
		
		Set<SavingAccount> expectedSet = new TreeSet<>(savingAccountList);//expected set created to compare the actual set after sorting on accountId
		expectedSet.add(new SavingAccount(101,"Ankit",4000,true));
		expectedSet.add(new SavingAccount(102,"deepika",3000,true));
		expectedSet.add(new SavingAccount(110,"Ankita",5000,true));
		
		assertEquals(expectedSet,listSet);									//assertEqual to test actual and expected values


	}

}
