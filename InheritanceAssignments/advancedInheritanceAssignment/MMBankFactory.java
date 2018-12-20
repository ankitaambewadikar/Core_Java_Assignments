package com.advancedInheritanceAssignment;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAccount getNewSavingAccount(String accountHolderName, double accountBalance, boolean isSalaried) {
		
		SavingAccount savingAccount = new MMSavingAccount(accountHolderName, accountBalance, isSalaried);
		return savingAccount;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(String accountHolderName, double accountBalance) {
		
		CurrentAccount currentAccount = new MMCurrentAccount(accountHolderName, accountBalance);
		
		return currentAccount;
	}

}
