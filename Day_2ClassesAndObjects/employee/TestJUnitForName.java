package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForName {					//test class for checking the String mane entered

	private Employee employee;
	@Before										//this runs before all test cases as the object needed in all test cases
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void validNametest() {
		
		employee.setEmployeeName("ankita");
		String valid = employee.getEmployeeName();
		assertEquals("ankita", valid);
	}
	@Test
	public void invalidNametest(){
		employee.setEmployeeName("deepika");
		String invalid = employee.getEmployeeName();
		assertNotEquals("ankita",invalid);
		
	}

}
