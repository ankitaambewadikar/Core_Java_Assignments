
import java.util.Scanner;

 class DisplayDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date , month ,year;
		String monthName = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the date:");
		date = scanner.nextInt();
		month = scanner.nextInt();
		year = scanner.nextInt();
		
		if(month == 01)
			monthName = "January";
		if(month == 02)
			monthName = "February";
		if(month == 03)
			monthName = "March";
		if(month == 04)
			monthName = "April";
		if(month == 04)
			monthName = "April";
		if(month == 05)
			monthName = "May";
		if(month == 06)
			monthName = "June";
		if(month == 07)
			monthName = "July";
		if(month == 8)
			monthName = "August";
		if(month == 9)
			monthName = "September";
		if(month == 10)
			monthName = "October";
		if(month == 11)
			monthName = "November";
		if(month == 12)
			monthName = "December";
		
		System.out.println("Display Date in dd/Month-Name/yyyy format : " + date + "/" + monthName + "/" + year);
	}

}
