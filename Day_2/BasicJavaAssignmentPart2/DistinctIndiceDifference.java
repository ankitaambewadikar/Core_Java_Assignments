package day_2;

public class DistinctIndiceDifference {


	public boolean checkDifference(int[] arrayOne, int indiceOne, int indiceTwo, int difference) {

		int result=0;
		for(int counter=0;counter<arrayOne.length;counter++){
			if(arrayOne[indiceOne] ==  arrayOne[indiceOne])
				result=indiceTwo-indiceOne;
			
			
		}
		System.out.println(result);
		if(result <= difference){
	
		return true;
		}
		else
		return false;	
		
		
	}

}
