import static org.junit.Assert.*;

import org.junit.Test;


public class ArmstrongNumberJUnit {
	
	private HelloTest helloTest;
	@Test
	public void armstrongNumberJUnitTest() {
		helloTest=new HelloTest();
		int answer = helloTest.checkArmstrongNumber(153);
		assertEquals(153, answer);
		
	}

}
