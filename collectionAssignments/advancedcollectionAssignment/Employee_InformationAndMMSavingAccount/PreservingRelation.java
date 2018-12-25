package com.advancedCollectionAssignment.Employee_InformationAndMMSavingAccount;

import java.util.Map;

public class PreservingRelation {

	private MMSavingAccount savingAccountOne;
	private EmployeeInformation employeeinformationOne;

	public PreservingRelation(MMSavingAccount savingAccountOne,EmployeeInformation employeeinformationOne) {
		this.savingAccountOne = savingAccountOne;
		this.employeeinformationOne = employeeinformationOne;
	}

	public PreservingRelation getDetails(String find,Map<String, PreservingRelation> relationMap) {

		System.out.println(relationMap.get(find));
		PreservingRelation result = relationMap.get(find);
		return result;
	}

	@Override
	public String toString() {
		return "PreservingRelation [savingAccountOne=" + savingAccountOne
				+ ", employeeinformationOne=" + employeeinformationOne + "]";
	}

}
