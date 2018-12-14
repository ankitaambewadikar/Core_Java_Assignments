package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForAnnualTakeHome {

	private Employee employee;
	@Before
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testOne() {
		
		employee.setMonthlyBasic(10000);
		double annualTakeHome = employee.getAnnualTakeHome();
		assertEquals(192000,annualTakeHome,0.02);
	
	}
	@Test
	public void testTwo() {
		
		employee.setMonthlyBasic(0);
		double annualTakeHome = employee.getAnnualTakeHome();
		assertEquals(24000,annualTakeHome,0.02);
	
	}

}
