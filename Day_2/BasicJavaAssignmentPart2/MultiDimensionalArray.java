package day_2;

public class MultiDimensionalArray {

	public int checkElement(int[][] numberArray, int tofind) {
		
		int result=0;
		for(int counterOne=1;counterOne<=3;counterOne++){
			for(int counterTwo=counterOne;counterTwo<=2;counterTwo++){
				
				if(numberArray[counterOne][counterTwo] == tofind){
					result=numberArray[counterOne][counterTwo];
					
				}
			}
		}
		System.out.println(result);
		
		return result;
	}

}
