/*
 * Q2. Program:to find wether entered number is armstrong or not 
 */



import java.util.Scanner;				

class ArmstrongNumber {			

	public static void main(String[] args) {					//main class
		
		int number,remainder,sum=0;
		System.out.println("Enter number:");
		 Scanner scanner = new Scanner(System.in);				//import Scanner class as if want to take input from user creating scanner object
		 number= scanner.nextInt();								//taking input from user using scanner.nextInt()
		 int temp = number;
		 

			while (number > 0) {
				 remainder=number%10;
				 sum += (remainder*remainder*remainder);
				 number = number/10; 
				
			} 
			if(temp==sum){
				 System.out.println("The given number"+ " " + sum + " " + "is an Armstrong number");
			}
			else{
				System.out.println("Not an Armstrong number");
			}
	
		

	}

}
