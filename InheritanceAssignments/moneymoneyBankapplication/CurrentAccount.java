package com.moneymoneyBankapplication;

public abstract class CurrentAccount extends BankAccount {
	
	protected final double creditLimit=500;
	
	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}

	public CurrentAccount( String accountHolderName,
			double accountBalance) {
		super( accountHolderName, accountBalance);
		
		
	}

	public abstract void withdraw(float amount) throws InsufficientException;

}
