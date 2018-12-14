package time;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTestCases {

	private Time timeOne ;
	private Time timeTwo;
	private Time timeThree;
	@Before
	public void setUp(){
		timeOne = new Time();
		timeTwo = new Time();
		timeThree = new Time();
	}
	
	@Test
	public void testGetHour() {
		
		timeOne.set(9,30);
		timeOne.display();
		timeTwo.set(22, 50);
		timeTwo.display();
		Time resultOne = timeThree.addTime(timeOne, timeTwo);
		assertEquals(8,resultOne.getHour());
		
	}
	@Test
	public void testGetMinute() {
		
		timeOne.set(4,30);
		timeOne.display();
		timeTwo.set(6, 50);
		timeTwo.display();
		Time resultOne = timeThree.addTime(timeOne, timeTwo);
		assertEquals(20,resultOne.getMinute());
		
	}

}
