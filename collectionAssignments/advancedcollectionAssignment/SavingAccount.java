package com.advancedcollectionAssignment;
import java.io.Serializable;
/**
 * 
 * @author aambewad
 * SavingAccount class implements serializable and Comparable.serializable for reading file data 
 * Comparable where compareTo method overidden
 *
 */
public class SavingAccount implements Serializable,Comparable<SavingAccount> {

	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalary;
	/**
	 * 
	 * @param accountId
	 * @param accountHolderName
	 * @param accountBalance
	 * @param isSalary
	 * where the instance methods are initialized
	 */
	public SavingAccount(int accountId, String accountHolderName,
			double accountBalance, boolean isSalary) {

		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalary = isSalary;
	}
	@Override
	public String toString() {
		return "SavingAccount [accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance
				+ ", isSalary=" + isSalary + "]";
	}
	/**
	 * 
	 * @return
	 * here all are the getters and setters 
	 */
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
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
	/**
	 * Here the compareTo method sorts according to accountId
	 */
	@Override
	public int compareTo(SavingAccount savingObject) {
		
		SavingAccount compareObject = (SavingAccount)savingObject;
		return this.accountId - compareObject.accountId;
	}
	
}
