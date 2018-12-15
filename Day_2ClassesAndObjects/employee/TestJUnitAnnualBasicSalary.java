package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitAnnualBasicSalary {							//test class to test AnnualBasicSalary

	private Employee employee;
	@Before															//this runs before all test cases as the object needed in all test cases
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testForPositiveMonthlyBasic() {
		
		employee.setMonthlyBasic(10000);
		double annualBasicSalary = employee.getAnnualBasicSalary();
		assertEquals(120000,annualBasicSalary,0.02);
		
		}
	@Test
	public void testForZeroMonthltBasic(){
		employee.setMonthlyBasic(0);
		double annualBasicSalary = employee.getAnnualBasicSalary();
		assertEquals(0,annualBasicSalary,0.02);
		
	}

}
