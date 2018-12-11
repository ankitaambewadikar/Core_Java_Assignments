/*
Q7 Program for Application based  where user is asked to enter UserNmae and password to login.On validation display "welcome" message else "wrong".As per validation user login attempts 
	are tracked and maximum attempts are 3. 
*/

import java.util.Scanner;					//import Scanner class so as user input can be taken.

class UserLoginId{						//main class which contains the main method
	public static void main(String[] args){
	
	String userName=null;
	String correctPassword="ankita123";
	String password;
	int attempts=3;

	Scanner scanner = new Scanner(System.in);
	
	
	while(attempts != 0){

		System.out.println("User Name :");
		userName = scanner.next();
		
		System.out.println("Password :");
		password=scanner.next();

		
		if(password.equals(correctPassword)){
			System.out.println("Welcome"+ " " + userName);
			return;
		}
		else{
			System.out.println("Wrong password");
			attempts--;
		}
	}
	if(attempts==0)
	System.out.println("Contact Admin maximum login attempts");
	}
}
			
