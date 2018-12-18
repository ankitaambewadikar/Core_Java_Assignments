package mmBankAccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForDepositAmount {

	@Test
	public void testForDepositAmount() {
		SavingAccount savingAccountOne = new SavingAccount("ankita",5000);
		double deposit=savingAccountOne.depositAmount(1000);
		assertEquals(6000,deposit,0.02);
	}
	@Test
	public void testTwoForDepositAmount(){
		SavingAccount savingAccountOne = new SavingAccount("ankit",2000);
		double deposit=savingAccountOne.depositAmount(1000);
		assertNotEquals(4000,deposit,0.02);
	}

}
