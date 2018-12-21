package mmBankAccount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestForDepositAmount {
	
	private SavingAccount savingAccountOne;
	@Before
	public void setUp(){
		savingAccountOne = new SavingAccount("ankita",5000);
	
	}

	@Test
	public void testForDepositAmount() {		
		savingAccountOne.depositAmount(1000);
		System.out.println("gggg");
		assertEquals(6000,savingAccountOne.getAccountBalance(),0.02);
	}
	
	@After
	public void setuUp(){
		SavingAccount savingAccountOne = new SavingAccount("ankita",5000);
	
	}

	/*@Test
	public void testTwoForDepositAmount(){
		SavingAccount savingAccountOne = new SavingAccount("ankit",2000);
		double deposit=savingAccountOne.depositAmount(1000);
		assertNotEquals(4000,deposit,0.02);
	}*/

}
