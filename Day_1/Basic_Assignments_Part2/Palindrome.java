import java.util.Scanner;

class Palindrome{
	public static void main(String[] args){
		int number; int remainder;
		int newNumber=0; int temp;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		temp=number;
		while(number!=0){
			remainder = number % 10;
			newNumber = (newNumber * 10) + remainder;
			number = number / 10;
		}

		if(newNumber == temp){
			System.out.println("number is palindrome");
		}
		else
			{
			System.out.println("not palindrome");
			}
			
	}
}