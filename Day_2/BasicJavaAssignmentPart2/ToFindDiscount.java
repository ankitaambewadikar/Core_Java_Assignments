package day_2;

public class ToFindDiscount {

	public float findDiscount(int amount) {		
		
		float discountAmount = (amount*35)/100;
		float newItemPrice = amount - discountAmount;
		return newItemPrice;								//return the newItem price to the test method
	}

}
