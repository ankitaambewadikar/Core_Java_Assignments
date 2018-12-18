package person;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Test;

public class TestForPersonOlderInMonths {

	@Test
	public void testOneToCheckValidMonthsDifference() {
		Person persons[] = new Person[2];
		persons[0] = new Person("ankita",23,10,1995);
		persons[1] = new Person("deepika",30,8,1996);
		LocalDate birthDate = LocalDate.of(1996,8,30);	  //birthdate
        LocalDate now = LocalDate.now();				  // current date
      
        Period diff = Period.between(birthDate, now);	  // difference between current date and date of birth
        //persons[0].display(diff);
        
		LocalDate birthDateTwo = LocalDate.of(1995,10,23);	  //birthdate
        LocalDate nowTwo = LocalDate.now();				  // current date
  
        Period diffTwo = Period.between(birthDateTwo, now);	  // difference between current date and date of birth
        //persons[1].display(diffTwo);
		
        int[] difference= persons[0].olderOne(persons[1]);;
        assertEquals(2,difference[1]);
        
		}
	@Test
	public void testTwoToCheckValidMonthsDifference() {
		Person persons[] = new Person[2];
		persons[0] = new Person("ankita",23,10,1995);
		persons[1] = new Person("deepika",30,8,1996);
		
		
		LocalDate birthDate = LocalDate.of(1995,10,23);	  //birthdate
        LocalDate now = LocalDate.now();				  // current date
      
        Period diff = Period.between(birthDate, now);	  // difference between current date and date of birth
        //persons[0].display(diff);
        
		LocalDate birthDateTwo = LocalDate.of(1996,8,30);	  //birthdate
        LocalDate nowTwo = LocalDate.now();				  // current date
  
        Period diffTwo = Period.between(birthDateTwo, now);	  // difference between current date and date of birth
        //persons[1].display(diffTwo);
		
        int[] difference= persons[0].olderOne(persons[1]);
        assertNotEquals(3,difference[1]);
        
		}

}
