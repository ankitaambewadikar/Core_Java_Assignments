package day_2;

import java.util.Arrays;

public class RemoveDuplicateCharacter {

	public String removeDuplicateSort(String inputString) {
		
		
		/*char[] stringOne = string.toCharArray();				//converting the String into character array
		int length= string.length();									//get the length of string
		System.out.println(stringOne);
		
		for(int counterOne=1;counterOne<stringOne.length;counterOne++){
			for(int countertwo=counterOne+1;stringOne[countertwo]!='\0';countertwo++){
				if(stringOne[countertwo] == stringOne[counterOne]){
					
					for(int counter3=countertwo;stringOne[counter3]!='\0';counter3++){
						
						stringOne[counter3]=stringOne[counter3+1];
					}
				}
			}
		}
		System.out.println(stringOne);
		return stringOne;*/
		

	    String result = new String("");

	    for (int i = 0; i < inputString.length(); i++) {
	        if (!result.contains("" + inputString.charAt(i))) {			//used not contains function to check the string contains the character
	            result += "" + inputString.charAt(i);
	        }
	    }
	    System.out.println(result);
	    return result;
	}

}
