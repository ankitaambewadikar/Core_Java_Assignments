package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForMonthlyTakeHome {

	private Employee employee;
	@Before
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testOne() {
		
		employee.setMonthlyBasic(10000);
		double monthlyTakeHome = employee.getMonthlyTakeHome();
		assertEquals(16000,monthlyTakeHome,0.02);
	}
	@Test
	public void testTwo() {
		
		employee.setMonthlyBasic(0);
		double monthlyTakeHome = employee.getMonthlyTakeHome();
		assertEquals(2000,monthlyTakeHome,0.02);
	}

}
