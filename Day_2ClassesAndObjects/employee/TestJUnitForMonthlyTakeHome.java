package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForMonthlyTakeHome {						//test class for monthlyTakeHome

	private Employee employee;
	@Before														////this runs before all test cases as the object needed in all test cases
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testOne() {
		
		employee.setMonthlyBasic(10000);
		double monthlyTakeHome = employee.getMonthlyTakeHome();
		assertEquals(16000,monthlyTakeHome,0.02);				//assert for checking double (expected,actual,delta)
	}
	@Test
	public void testTwo() {
		
		employee.setMonthlyBasic(0);
		double monthlyTakeHome = employee.getMonthlyTakeHome();
		assertEquals(2000,monthlyTakeHome,0.02);
	}

}
