/*
 * Write a Java assignment statement to calculate a 35% discount on an item’s value stored in the variable newItem, 
store the discount amount in a variable called discount. Then calculate the new price for the item subtracting off the discount,
 storing the new price in a variable called newItemPrice.
 * */
package day_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindDiscountJUnitTest {							 //JUnit Test class to test the cases

	@Test
	public void findDiscountTestOne() {							//function to test case one to find discount
		
		ToFindDiscount toFindDiscount = new ToFindDiscount();
		float result = toFindDiscount.findDiscount(1000);
		assertEquals(650,result,0.02);							// here as we the return value may be int or float 
																//we have used assertEquals for double 
																//where assertEquals(expected,actual,delta);
																//delta varies
	
		
	}

}
