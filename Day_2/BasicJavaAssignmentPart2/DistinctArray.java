package day_2;

public class DistinctArray {

	public int checkDistinctElement(int distinctArray[]) {
		
			int counter, total=0; 
			int arrayLength = distinctArray.length;
			//System.out.println(distinctArray);
			
	        total  = (arrayLength+1)*(arrayLength+2)/2;    
	        for ( counter = 0; counter< arrayLength; counter++) 
	        	total -= distinctArray[counter]; 
	        System.out.println(total);
	        return total;
		
	}

}