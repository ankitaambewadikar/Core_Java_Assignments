package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitMonthlyDeductations {
	
	private Employee employee;
	@Before
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testOne() {
		employee.setMonthlyBasic(10000);
		double monthlyDeductions = employee.getMonthlyDeductions();
		assertEquals(1050,monthlyDeductions,0.02);	
		
	}
	@Test
	public void testTwo() {
		employee.setMonthlyBasic(0);
		double monthlyDeductions = employee.getMonthlyDeductions();
		assertEquals(50,monthlyDeductions,0.02);	
		
	}

}
