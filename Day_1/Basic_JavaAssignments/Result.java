
import java.util.Scanner;

class Result {

	public static void main(String[] args) {
	
		
		int subOneMarks,subTwoMarks,subThreeMarks;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter subject one marks :");
		subOneMarks = scanner.nextInt();
		System.out.println("Enter subject two marks :");
		subTwoMarks = scanner.nextInt();
		System.out.println("Enter subject three marks :");
		subThreeMarks = scanner.nextInt();
		
		if((subOneMarks > 60) && (subTwoMarks > 60 ) && (subThreeMarks > 60)){
			System.out.println("Passed");
		
		}
		else if (((subOneMarks>60)&& (subTwoMarks>60))|| ((subTwoMarks>60)&& (subThreeMarks>60))||((subOneMarks>60) && (subThreeMarks>60))){
			System.out.println("Promoted");
			
		}
		else if (((subOneMarks > 60)|| (subTwoMarks > 60) ||(subThreeMarks > 60)) || ((subOneMarks < 60)|| (subTwoMarks < 60) ||(subThreeMarks < 60))){
			System.out.println("Failed");
		}

	}

}
