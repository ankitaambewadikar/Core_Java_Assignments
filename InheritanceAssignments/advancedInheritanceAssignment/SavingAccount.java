package com.advancedInheritanceAssignment;

public abstract class  SavingAccount extends BankAccount {
	
	private boolean isSalaried;
	private static final float  MINBAL=1000;

	
	public SavingAccount(String accountHolderName,
			double accountBalance,boolean isSalaried) 
	{
		super( accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
		
	}
	public abstract void withdraw(float amount) throws InsufficientException;
		
	

	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}
	
}


