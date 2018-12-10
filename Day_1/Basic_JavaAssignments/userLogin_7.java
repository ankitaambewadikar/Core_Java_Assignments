
import java.util.Scanner;

class UserLoginId{
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
			
