package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForAnnualGrossSalary {

	private Employee employee;
	@Before
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testOneForAnnualGrossSalary() {
		
		employee.setMonthlyBasic(10000);
		double annualGross=employee.getAnnualGrossSalary();
		assertEquals(204600,annualGross,0.02);
	}
	@Test
	public void testTwoForAnnualGrossSalary() {
		
		employee.setMonthlyBasic(0);
		double annualGross=employee.getAnnualGrossSalary();
		assertEquals(24600,annualGross,0.02);
	}

}
