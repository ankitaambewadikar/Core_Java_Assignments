package mmBankAccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForWithdrawAmount {

	@Test
	public void testOneForWithdraw() {
		SavingAccount savingAccountOne = new SavingAccount("ankita",5000);
		double withdraw = savingAccountOne.withdrawAmount(2000);
		assertEquals(3000,withdraw,0.02);

	}
	@Test
	public void testTwoForWithdraw() {
		SavingAccount savingAccountOne = new SavingAccount("ankita",5000);
		double withdraw = savingAccountOne.withdrawAmount(2000);
		assertNotEquals(4000,withdraw,0.02);


	}

}
