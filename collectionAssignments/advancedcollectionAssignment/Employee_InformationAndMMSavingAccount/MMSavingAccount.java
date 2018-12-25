package com.advancedCollectionAssignment.Employee_InformationAndMMSavingAccount;

public class MMSavingAccount {

	private int accountNumber;
	private String accountHoldername;
	private double accountBalance;
	private boolean isSalary;
	public MMSavingAccount(int accountNumber, String straccountHoldernameing, double accountBalance, boolean isSalary) {
		
		this.accountNumber = accountNumber;
		this.accountHoldername = accountHoldername;
		this.accountBalance = accountBalance;
		this.isSalary = isSalary;
	}
	@Override
	public String toString() {
		return "MMSavingAccount [accountNumber=" + accountNumber
				+ ", accountHoldername=" + accountHoldername
				+ ", accountBalance=" + accountBalance + ", isSalary="
				+ isSalary + "]";
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
}
