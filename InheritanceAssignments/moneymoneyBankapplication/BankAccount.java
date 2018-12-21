package com.moneymoneyBankapplication;
/**
 * 
 * @author aambewad
 * abstract class BankAccount with fields accountNumber,accountHolderName,accountBalance,initialAccountNumber
 *  where it consist of abstract method withdraw and deposit 
 * 
 *
 */

public abstract class BankAccount {										//abstract bankAccount class with abstract methods withdraw and deposit

	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;
	private static int initialAccountNumber = 0;						//initial account number is assigned and each time object refrence created the accountnumber is incremented
/**
 * 
 * @param accountHolderName
 * @param accountBalance
 * This is a parametrized constructor used to initialize fields
 */
	public BankAccount(String accountHolderName,						
			double accountBalance) {
		super();
		
		accountNumber = ++initialAccountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
/**
 * getAccountNumber to check the account number initialized on every object creation
 * @return
 */
	public int getAccountNumber() {
		return initialAccountNumber+1;
	}

/**
 * 
 * @param amount
 * @throws InvalidAmountException
 * this is deposit method which throws exception when zero amount entered to deposit
 */
	public void deposit(float amount) throws InvalidAmountException {
		if(amount > 0){
			this.accountBalance = this.accountBalance + amount;
			}
		else
			throw new InvalidAmountException("Invalid amount entered to deposit");


	}
/**
 * ToString method Override
 */

	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}

/**
 * 
 * @return
 * getAccountBalance() to return the value of accountBalance
 */

	public double getAccountBalance() {
		return accountBalance;
	}
	/**
	 * 
	 * @param amount
	 * @throws InsufficientException
	 * withdraw method throws exception when the amount entered is exceeding the limit 
	 */

	public abstract void withdraw(float amount) throws InsufficientException;
}
