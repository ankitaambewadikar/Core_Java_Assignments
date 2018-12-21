package com.moneymoneyBankapplication;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBank {
	
	private BankFactory bankFactory;
	SavingAccount savingAccount;
	CurrentAccount currentAccount;
	private Logger logger = Logger.getLogger(BankAccount.class.getName());

	@Before
	public void setUp(){
		BasicConfigurator.configure();
		//logger.debug("Set Up start");
		bankFactory = new MMBankFactory();
		//logger.info("instance of MMBankFactory to BankFactory reference");
		savingAccount = bankFactory.getNewSavingAccount("Ankita",2500,true);
		currentAccount = bankFactory.getNewCurrentAccount("deepika", 2000);
		}
	/*@Test
	public void testForGetAccountNumberSavingAccount(){
		assertEquals(13,savingAccount.getAccountNumber());
	}
	@Test
	public void testForGetAccountNumberCurrentAccount(){
		assertEquals(23,currentAccount.getAccountNumber());
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
	public void testForValidDepositAmountSavingAccount(){
		try {
			savingAccount.deposit(1000);
			assertEquals(3500,savingAccount.getAccountBalance(),0.02);
			} catch (InvalidAmountException e) {
			//e.printStackTrace();
			logger.error("Invalid Amount entered to deposit");
			}
	}
		

	@Test
	public void testForInValidDepositAmountSavingAccount(){
		try {
			savingAccount.deposit(0);
			assertEquals(2500,savingAccount.getAccountBalance(),0.02);
		} catch (InvalidAmountException e) {
			//e.printStackTrace();
			logger.error("Invalid Amount entered to deposit");
			}
	}
	@Test
	public void testForValidDepositAmountCurrentAccount(){
		try {
			currentAccount.deposit(1000);

		} catch (InvalidAmountException e) {
			//e.printStackTrace();
			logger.error("Invalid Amount entered to deposit");

		}
		assertEquals(3000,currentAccount.getAccountBalance(),0.02);
	}
	@Test
	public void testForInValidDepositAmountCurrentAccount(){
		try {
			currentAccount.deposit(0);
			assertNotEquals(1000,currentAccount.getAccountBalance(),0.02);
		} catch (InvalidAmountException e) {
			//e.printStackTrace();
			logger.error("Invalid Amount entered to deposit");
			}
	}
	

	@Test
	public void testForWithdrawAmountSavingAccountWithValidAmount(){
		
		try {
			savingAccount.withdraw(1000);
			assertEquals(1500, savingAccount.getAccountBalance(),0.02);
		} catch (InsufficientException e) {
			//e.printStackTrace();
			logger.error("Insufficient Balance in Saving Account");
		}
	}
	@Test
	public void testForWithdrawAmountSavingAccountWithInValidAmount(){
		
		try {
			savingAccount.withdraw(3000);
			assertNotEquals(400, savingAccount.getAccountBalance(),0.02);
			} catch (InsufficientException e) {
			//e.printStackTrace();
			logger.error("Insufficient Balance in Saving Account");
			}
	}


	@Test
	public void testForWithdrawAmountCurrentAccountWithValidAmount(){
		try {
			currentAccount.withdraw(1000);
			assertEquals(1000,currentAccount.getAccountBalance(),0.02);
		} catch (InsufficientException e) {
			//e.printStackTrace();
			logger.error("Insufficient Balance in Current Account");
			}
	}
	
	
	@Test
	public void testForWithdrawAmountCurrentAccountWithInValidAmount(){
		try {
			currentAccount.withdraw(3000);
			assertNotEquals(1000,currentAccount.getAccountBalance(),0.02);

		} catch (InsufficientException e) {
			//e.printStackTrace();
			logger.error("Insufficient Balance in Current Account");
			}
	}
}
