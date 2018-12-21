package com.moneymoneyBankapplication;

public class MMCurrentAccount extends CurrentAccount {
	
	
	public MMCurrentAccount(String accountHolderName,double accountBalance) {
		super(accountHolderName, accountBalance);
		
	}
	
	@Override
	public void withdraw(float amount) throws InsufficientException{
		double withdrawLimit = creditLimit + this.getAccountBalance();
		
		if(amount < withdrawLimit){
		this.accountBalance=this.getAccountBalance() - amount;

		}
		else{
			throw new InsufficientException("Insufficient balance");
		}
		
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString() + "]";
	}

}
