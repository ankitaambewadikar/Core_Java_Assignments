package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForMonthlyGrossSalary {

	private Employee employee;
	@Before
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testOneForMonthlyBasicGrossSalary() {
		employee.setMonthlyBasic(10000);
		double monthlyGross = employee.getMonthlyGrossSalary();
		assertEquals(17050,monthlyGross,0.02);
		
	}
	@Test
	public void testTwoForMonthlyBasicGrossSalary() {
		employee.setMonthlyBasic(0);
		double monthlyGross = employee.getMonthlyGrossSalary();
		assertEquals(2050,monthlyGross,0.02);
		
	}


}
