package employee;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnitForMonthlyBasic {
	private Employee employee;
	@Before
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
