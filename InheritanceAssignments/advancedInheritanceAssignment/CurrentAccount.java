package com.advancedInheritanceAssignment;

public abstract class CurrentAccount extends BankAccount {
	
	private final double creditLimit;
	
	public CurrentAccount(int accountNumber, String accountHolderName,
			double accountBalance,double creditLimit) {
		super(accountNumber, accountHolderName, accountBalance);
		this.creditLimit=creditLimit;
		
	}

	public abstract double withdraw(float amount);

}
