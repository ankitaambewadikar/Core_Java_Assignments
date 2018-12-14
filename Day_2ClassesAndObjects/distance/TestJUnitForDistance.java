package distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnitForDistance {
	
	private Distance objectOne = new Distance();
	private Distance objectTwo = new Distance();
	private Distance objectThree = new Distance();
	@Test
	public void main() {
		objectOne.set(5,(float) 8.0);
		objectOne.display();
		objectTwo.set(4,5);
		objectTwo.display();
		objectThree.add(objectOne,objectTwo);	
		
	}

}
