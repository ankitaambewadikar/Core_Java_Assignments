package person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

	private String personName;
	private Date DateOfBirth;
	private int day;
	private int month;
	private int year;

	
	Person(String personName,int day,int month,int year){
		
		this.personName = personName;
		this.day = day;	
		this.month= month;
		this.year = year;
	}
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Period display(Period diff) {

		System.out.println("Person Name :" + personName);
		System.out.println("Date of Birth : "+ day + "/" + month + "/" + year);
		System.out.printf("\n %d years, %d months and %d days old.\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
		return diff;
		
		}


/*	public int[] olderOne(Person person) {
		
		int[] difference = new int[3];
		difference[0] = (person.day < day) ? (day - person.day) : (person.day - day);
		difference[1] = (person.month < month) ? (month - person.month) : (person.month -month);
		difference[2] = (person.year < year) ? (year - person.year) : (person.year - year);
		System.out.println(this.personName+  "  "+"is older than " + person.getPersonName() + "  by" +" "+ difference[2] + " Years ," + difference[1] + " Months ," + difference[0] + "  days");
		return difference;

		
	}*/
	public Period olderOne(Person person){
		
		LocalDate personOneDate = LocalDate.of(1995,10,23);
		LocalDate personTwoDate = LocalDate.of(1996, 8, 30);
		if(personOneDate.getYear()< personTwoDate.getYear()){
			Period difference = Period.between(personOneDate, personTwoDate);
			System.out.println(difference.getYears());
			System.out.println(difference);	
			return difference;
		}
		else
		{
			Period difference = Period.between(personTwoDate, personOneDate);
			System.out.println(difference.getYears());
			System.out.println(difference);
			return difference;
		}

		
		
		
	}

}