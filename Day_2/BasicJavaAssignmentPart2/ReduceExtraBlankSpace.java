package day_2;

import java.util.Arrays;

public class ReduceExtraBlankSpace {

	public String checkBlankSpace(String input, String string, int position) {		// class where the test caeses logic present
						
		String newInput = input.replaceAll("\\s+", " ");							//to remove all the extra spaces present in the string
		System.out.println(newInput);
		String[] newStringArray = newInput.split(" ");								//convert the String into string Array.
		
		for(int counter = 0;counter < newStringArray.length;counter++){
				
			if(newStringArray[counter]== newStringArray[position]){
				
				newStringArray[counter] = newStringArray[counter].replaceAll(string, " ");//compare and replace the word at the position given
			}
		}
		System.out.println(Arrays.toString(newStringArray));
		
		String result = " ";
		String resultOne = String.join(result, newStringArray);				//convert the string Array to string
		System.out.println(resultOne);

		return resultOne;
	}




}
