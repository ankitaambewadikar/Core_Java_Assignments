package day_2;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Palindrome {

			public boolean checkPalindrome(String string) {						//boolean method created to check given number is palindrome or not
			
			char[] stringToCharArrayOne = string.toCharArray();				//converting the String into character array
			int length= string.length();									//get the length of string
			
			char[] reverseArray = new char[length];
			
			for(int countOne=0,countTwo=length-1;countOne<length && countTwo >= 0 ;countOne++,countTwo--)
			{
				reverseArray[countOne] = stringToCharArrayOne[countTwo];
			}
			boolean check = Arrays.equals(reverseArray,stringToCharArrayOne);
			return check;

			

		   }
		
		

	}


