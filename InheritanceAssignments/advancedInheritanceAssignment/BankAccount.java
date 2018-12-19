package com.advancedInheritanceAssignment;

public abstract class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;

	public BankAccount(int accountNumber, String accountHolderName,
			double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public void deposit(float amount) {

		this.accountBalance += this.accountBalance + amount;

	}

	public abstract double withdraw(float withdrawAmount);


	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}


}
