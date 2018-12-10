import java.util.Scanner;

class StudentMarks{

	public static void main(String[] args){

	int subjectOne=0,subjectTwo=0,subjectThree=0;
	int tm=0;
	float av=0;
	Scanner scanner = new Scanner(System.in);

	for(int count = 1; count <= 3; count++){


	System.out.println("Enter marks of student"+ count + " :");
	subjectOne = scanner.nextInt();
	subjectTwo = scanner.nextInt();
	subjectThree = scanner.nextInt();

	int totalMarks = totalMark(subjectOne,subjectTwo,subjectThree);
	System.out.println("The total marks of student"+ count +" are :" + totalMarks);

	tm=tm+totalMarks;

	float averageMarks = average(totalMarks);
	System.out.println("The average marks scored by student" + count +" are :" + averageMarks );

	av=av+averageMarks;

	
	}
	System.out.println("Total marks scored by 3 students are:"+ tm);
	System.out.println("Average marks are :" + av);
		
	
	}

	static int totalMark(int subOne,int subTwo,int subThree){
		
		return(subOne+subTwo+subThree);
	}
	
	static float average(int marks){
		return (marks/3);
	}

}