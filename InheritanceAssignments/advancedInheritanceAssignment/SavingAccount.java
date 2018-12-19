package com.advancedInheritanceAssignment;

public abstract class  SavingAccount extends BankAccount {
	
	private boolean isSalaried;
	static final  float MINBAL=1000;

	
	public SavingAccount(int accountNumber, String accountHolderName,
			double accountBalance,boolean isSalaried) 
	{
		super(accountNumber, accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
		
	}
	public abstract double withdraw(float amount);
		
	

	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", toString()="
				+ super.toString() + "]";
	}
	
}


