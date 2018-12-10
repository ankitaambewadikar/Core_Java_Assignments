/*
 Q1. Program :to display the square of input number and also print the table with square of table
 */


import java.util.Scanner;												//import scanner library

class Square_table {				

	public static void main(String[] args) {						   //main class
		
		int number;					
	    System.out.println("Enter an integer to print it's multiplication table"
	    		+ " and square of each number");
	    Scanner scanner = new Scanner(System.in);					//import Scanner class as if want to take input from user
	    number = scanner.nextInt();									//taking input from user
	    
	    square(number);

	}





public static void square(int numberOne){
	int count;
	
    System.out.println("Square of number is:"+ (numberOne*numberOne));
    System.out.println("Multiplication table of " + numberOne);

    for (count = 1; count <= 10; count++)
      System.out.println(numberOne + "*" + count + " = " + (numberOne*count)+"---------"+((numberOne*count)*(numberOne*count)));
	
}	

}


