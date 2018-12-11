package day_2;


public class ReverseString {

	public String reverseString(String inputString) {
		
		
		String[] words = inputString.split(" ");
		String reversedString = " ";
		for (int countOne = 0; countOne < words.length;countOne++)
	        {
	           String word = words[countOne]; 
	           String reverseWord = " ";
	           for (int countTwo = word.length()-1; countTwo >= 0; countTwo--) 
		   {
			
			reverseWord = reverseWord + word.charAt(countTwo);
		   }
		   reversedString = reversedString + reverseWord;
		}
		System.out.println(reversedString);
		
		return reversedString;
		
	}

}

