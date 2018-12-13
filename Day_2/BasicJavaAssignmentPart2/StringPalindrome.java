package day_2;

import java.util.Arrays;

public class StringPalindrome {

	public boolean checkPalindrome(String input) {
		
		System.out.println(input);
		
		char[] stringToCharArrayOne = input.toCharArray();		//converting the String into character array
		int length= input.length();								//get the length of string
		
		char[] reverseArray = new char[length];
		
		for(int countOne=0,countTwo=length-1;countOne<length && countTwo >= 0 ;countOne++,countTwo--)
		{
			reverseArray[countOne] = stringToCharArrayOne[countTwo];
		}
		boolean check = Arrays.equals(reverseArray,stringToCharArrayOne);
		return check;


		
		
	}

}
