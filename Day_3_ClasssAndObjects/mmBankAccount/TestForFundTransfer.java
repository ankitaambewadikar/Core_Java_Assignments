package mmBankAccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForFundTransfer {

	@Test
	public void testOneForFundTransfer() {
		SavingAccount savingAccountOne = new SavingAccount("ankita",5000);
		SavingAccount savingAccountTwo= new SavingAccount("ankit",1500);
		boolean transfer =PaymentGateway.fundTransfer(savingAccountOne,savingAccountTwo,2000);
		assertEquals(true,transfer);
	}
	@Test
	public void testTwoForFundTransfer() {
		SavingAccount savingAccountOne = new SavingAccount("ankita",5000);
		SavingAccount savingAccountTwo= new SavingAccount("ankit",1500);
		boolean transfer =PaymentGateway.fundTransfer(savingAccountOne,savingAccountTwo,2000);
		assertNotEquals(false,transfer);
	}
	

}
