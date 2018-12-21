package person;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Before;
import org.junit.Test;


public class TestPerson {
	

	private Person persons[] = new Person[2];
	private LocalDate birthdateOne;
	private Period diff;
	@Before 
	public void setUp(){
		persons[0] = new Person("Ankita", 23, 10, 1995);
		persons[1] = new Person("Deepika", 30, 8, 1996);
		LocalDate birthdateOne = LocalDate.of(1995, 10, 23);
		
		LocalDate now = LocalDate.now();
		Period diff = Period.between(birthdateOne, now);
		
	}
	@Test
	public void testToCheckpersonOneBirthYear(){

		assertEquals(23,diff.getYears());
		
	}
	/*@Test
	public void testOneToCheckPersonCheckYears() {
		
			Person personOne = new Person("ankita",23,10,1995);
		
			LocalDate birthDate = LocalDate.of(1995,10,23);	  //birthdate
	        LocalDate now = LocalDate.now();				  // current date
	      
	        Period diff = Period.between(birthDate, now);	  // difference between current date and date of birth
	        Period diffOne =personOne.display(diff);
	        assertEquals(23,diffOne.getYears());
	        }
	@Test
	public void testTwoToCheckPersonCheckYears() {
		
			Person personOne = new Person("ankita",23,10,1995);
		
			LocalDate birthDate = LocalDate.of(1995,10,23);	  //birthdate
	        LocalDate now = LocalDate.now();				  // current date
	      
	        Period diff = Period.between(birthDate, now);	  // difference between current date and date of birth
	        Period diffOne =personOne.display(diff);
	        assertEquals(23,diffOne.getYears());
	        }
	@Test
	public void testOneToCheckPersonCheckMonths() {
		
			Person personOne = new Person("ankita",23,10,1995);
		
			LocalDate birthDate = LocalDate.of(1995,10,23);	  //birthdate
	        LocalDate now = LocalDate.now();				  // current date
	      
	        Period diff = Period.between(birthDate, now);	  // difference between current date and date of birth
	        Period diffOne =personOne.display(diff);
	        assertEquals(1,diffOne.getMonths());
	        }

	@Test
	public void testOneToCheckPersonCheckDays() {
		
			Person personOne = new Person("ankita",23,10,1995);
		
			LocalDate birthDate = LocalDate.of(1995,10,23);	  //birthdate
	        LocalDate now = LocalDate.now();				  // current date
	      
	        Period diff = Period.between(birthDate, now);	  // difference between current date and date of birth
	        Period diffOne =personOne.display(diff);
	        assertEquals(25,diffOne.getDays());
	        }
	@Test
	public void testTwoToCheckPersonCheckDays() {
		
			Person personOne = new Person("ankita",23,10,1995);
		
			LocalDate birthDate = LocalDate.of(1995,10,23);	  //birthdate
	        LocalDate now = LocalDate.now();				  // current date
	      
	        Period diff = Period.between(birthDate, now);	  // difference between current date and date of birth
	        Period diffOne =personOne.display(diff);
	        assertEquals(25,diffOne.getDays());
	        }*/

}
