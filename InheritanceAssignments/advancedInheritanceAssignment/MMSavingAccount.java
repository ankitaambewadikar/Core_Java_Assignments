package com.advancedInheritanceAssignment;

public  class MMSavingAccount extends SavingAccount {

	
	private static final float MINBAL=1000;
	
	public MMSavingAccount(String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super( accountHolderName, accountBalance, isSalaried);
		
	}

	@Override
	public String toString() {
		return "MMSavingAccount [toString()=" + super.toString() + "]";
	}

	@Override
	public void withdraw(float amount) throws InsufficientException {
			
				if(amount < this.getAccountBalance() && amount >= MINBAL){
					//super.deposit(-amount);
					this.accountBalance = this.getAccountBalance() - amount;
				
					
				}
				else{
						throw new InsufficientException("Insufficient balance");
				}
			
		
	}
	


}
