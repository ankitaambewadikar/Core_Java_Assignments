package time;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {

	/*private Time timeOne ;
	private Time timeTwo;
	private Time timeThree;
	@Before
	public void setUp(){
		timeOne = new Time();
		timeTwo = new Time();
		timeThree = new Time();
	}*/
	@Test
	public void main() {						//main function to create three time objects
		Time timeOne = new Time();
		Time timeTwo = new Time();
		Time timeThree = new Time();
		
		timeOne.set(12,30);
		timeOne.display();
		timeTwo.set(12,40);
		timeTwo.display();
		timeThree.addTime(timeOne,timeTwo);		//function to add two time value objects
		
		
	}


}
