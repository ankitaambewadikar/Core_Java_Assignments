package day_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReduceExtraBlankSpaceJUnitTest {

	private ReduceExtraBlankSpace blankSpace;
	@Before
	public void setUp(){
		blankSpace= new ReduceExtraBlankSpace();
	}
	@Test
	public void checkBlankSpaceTest() {
		
		String input = "  A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.";
		String result = blankSpace.checkBlankSpace(input);
		
	}

}
