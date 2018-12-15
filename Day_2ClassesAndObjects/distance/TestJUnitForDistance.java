

package distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnitForDistance {
	
	private Distance objectOne = new Distance();
	private Distance objectTwo = new Distance();
	private Distance objectThree = new Distance();
	@Test
	public void main() {								//DistanceTest class with main function to create three Distance objects
		objectOne.set(5,(float) 8.0);					//set valus for two objects
		objectOne.display();							//display the data set
		objectTwo.set(4,5);
		objectTwo.display();
		objectThree.add(objectOne,objectTwo);			// adding the two object values
		
	}

}
