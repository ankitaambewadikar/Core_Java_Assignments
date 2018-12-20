package com.advancedInheritanceAssignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBank {
	
	private BankFactory bankFactory;
	SavingAccount savingAccount;
	CurrentAccount currentAccount;
	@Before
	public void setUp(){
		bankFactory = new MMBankFactory();
		savingAccount = bankFactory.getNewSavingAccount("Ankita",2500,true);
		currentAccount = bankFactory.getNewCurrentAccount("deepika", 2000);
		}
	@Test
	public void testForGetAccountNumberSavingAccount(){
		assertEquals(11,savingAccount.getAccountNumber());
	}
	/*@Test
	public void testForGetAccountNumberCurrentAccount(){
		assertEquals(4,currentAccount.getAccountNumber());
	}*/
	@Test
	public void testForGetAccountBalanceSavingAccount(){
		assertEquals(2500,savingAccount.getAccountBalance(),0.02);
	}
	@Test
	public void testForGetAccountBalanceCurrentAccount(){
		assertEquals(2000,currentAccount.getAccountBalance(),0.02);
	}
	
	@Test
	public void testForValidDepositAmountsavingAccount(){
		try {
			savingAccount.deposit(1000);
			assertEquals(3500,savingAccount.getAccountBalance(),0.02);
			//assertEquals(3,savingAccount.getAccountNumber());

		} catch (InvalidAmountException e) {
			//e.printStackTrace();
		}
	}
		

	@Test
	public void testForInValidDepositAmountsavingAccount(){
		try {
			savingAccount.deposit(0);
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
		assertNotEquals(1000,savingAccount.getAccountBalance(),0.02);
		}
	@Test
	public void testForInValidDepositAmountsCurrentAccount(){
		try {
			currentAccount.deposit(0);
		} catch (InvalidAmountException e) {
			//e.printStackTrace();
		}
		assertNotEquals(1000,currentAccount.getAccountBalance(),0.02);
		}
	

	@Test
	public void testForWithdrawAmountFormSavingAccountWithValidAmount(){
		
		try {
			savingAccount.withdraw(1000);
		} catch (InsufficientException e) {
			//e.printStackTrace();
		}
		assertEquals(1500, savingAccount.getAccountBalance(),0.02);
	}
	@Test
	public void testForWithdrawAmountFormSavingAccountWithInValidAmount(){
		
		try {
			savingAccount.withdraw(3000);
		} catch (InsufficientException e) {
			//e.printStackTrace();
		}
		assertNotEquals(400, savingAccount.getAccountBalance(),0.02);
	}


	@Test
	public void testForWithdrawAmountFormCurrentAccountWithValidAmount(){
		try {
			currentAccount.withdraw(1000);
		} catch (InsufficientException e) {
			//e.printStackTrace();
		}
		assertEquals(1000,currentAccount.getAccountBalance(),0.02);
	}
	@Test
	public void testForWithdrawAmountFormCurrentAccountWithInValidAmount(){
		try {
			currentAccount.withdraw(3000);
		} catch (InsufficientException e) {
			//e.printStackTrace();
		}
		assertNotEquals(1000,currentAccount.getAccountBalance(),0.02);
	}
	
	
	
	
}
