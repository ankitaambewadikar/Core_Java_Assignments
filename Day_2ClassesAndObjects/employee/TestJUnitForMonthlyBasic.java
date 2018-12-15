package employee;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnitForMonthlyBasic {						//test class for testng the MonthlyBasic
	private Employee employee;
	@Before													//this runs before all test cases as the object needed in all test cases
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testOneForMonthlyBasic() {
		
		employee.setMonthlyBasic(10000);
		double monthlyBasic = employee.getMonthlyBasic();
		assertEquals(10000,monthlyBasic,0.02);
		
	}

	@Test
	public void testOneForMonthlyBasicZero() {
		
		employee.setMonthlyBasic(10000);
		double monthlyBasic = employee.getMonthlyBasic();
		assertNotEquals(0,monthlyBasic,0.02);
		
	}
	

}
