package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForEmployeeId {							//test class to check entered employeeId 

	private Employee employee;
	@Before														//this runs before all test cases as the object needed in all test cases
	public void setUp(){
		employee = new Employee();
	}
	@Test
	public void testForValidEmployeeId() {
		employee.setEmployeeId(166015);
		int valid = employee.getEmployeeId();
		assertEquals(166015,valid);
		
	}
	@Test
	public void testForinValidEmployeeId() {
		employee.setEmployeeId(166014);
		int invalid = employee.getEmployeeId();
		assertNotEquals(166015,invalid);
		
	}
	

}
