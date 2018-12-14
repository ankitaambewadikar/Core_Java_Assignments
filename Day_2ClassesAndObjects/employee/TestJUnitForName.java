package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJUnitForName {

	private Employee employee;
	@Before
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
