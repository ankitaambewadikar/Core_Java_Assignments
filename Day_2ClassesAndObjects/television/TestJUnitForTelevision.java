package television;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJUnitForTelevision {

	/*private Television state;
	
	@Before
	public void setUp()
	{
		state = new Television(0);
	}*/
	@Test
	public void testStateOn() {
		 Television state = new Television(true);
		 boolean stateOne = state.stateOfTelevision();
		 assertEquals(true,stateOne);
	}
	
	@Test
	public void teststateTwo() {
		Television state = new Television(false);
		boolean stateTwo = state.stateOfTelevision();
		assertEquals(false,stateTwo);
	}

	

}
