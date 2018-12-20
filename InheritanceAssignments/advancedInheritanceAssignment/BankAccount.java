package com.advancedInheritanceAssignment;

public abstract class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;
	private static int initialAccountNumber = 0;

	public BankAccount(String accountHolderName,
			double accountBalance) {
		super();
		
		accountNumber = ++initialAccountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return initialAccountNumber+1;
	}


	public void deposit(float amount) throws InvalidAmountException {
		if(amount > 0){
			this.accountBalance = this.accountBalance + amount;
			}
		else
			throw new InvalidAmountException("Invalid amount entered to deposit");


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

	public abstract void withdraw(float amount) throws InsufficientException;
}
