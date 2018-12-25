package com.advancedCollectionAssignment.Employee_InformationAndMMSavingAccount;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestEmployeeMMSaving {

	@Test
	public void test() {
		
		PreservingRelation relationOne=null;
		MMSavingAccount savingAccountOne = new MMSavingAccount(4587,"Ankita",6000,true);
		EmployeeInformation employeeinformationOne  = new EmployeeInformation(166015,"Ankita","Analyst",14000);
		PreservingRelation relation = new PreservingRelation(savingAccountOne,employeeinformationOne);
		
		MMSavingAccount savingAccountTwo = new MMSavingAccount(6687,"deepika",4000,true);
		EmployeeInformation employeeinformationTwo  = new EmployeeInformation(166015,"deepika","Programmer Analyst",14000);
		PreservingRelation relationTwo = new PreservingRelation(savingAccountTwo,employeeinformationTwo);
		
		MMSavingAccount savingAccountThree = new MMSavingAccount(4587,"Ankit",6000,true);
		EmployeeInformation employeeinformationThree  = new EmployeeInformation(166015,"Ankit","Analyst",14000);
		PreservingRelation relationThree = new PreservingRelation(savingAccountThree,employeeinformationThree);
		
		MMSavingAccount savingAccountFour = new MMSavingAccount(4587,"Ram",6000,true);
		EmployeeInformation employeeinformationFour  = new EmployeeInformation(166015,"Ram","Analyst",14000);
		PreservingRelation relationFour = new PreservingRelation(savingAccountFour,employeeinformationFour);
		
		Map<String,PreservingRelation> relationMap = new HashMap<String,PreservingRelation>();
		relationMap.put("Ankita", relation);
		relationMap.put("deepika",relationTwo);
		relationMap.put("Ankit", relationThree);
		relationMap.put("Ram", relationFour);
		
		relationOne.getDetails("Ankita",relationMap);
		
		
	}

}
