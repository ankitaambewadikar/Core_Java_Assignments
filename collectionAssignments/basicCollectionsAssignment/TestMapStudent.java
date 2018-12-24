package com.basicCollectionsAssignment;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author aambewad
 *
 */
public class TestMapStudent {

	private MapStudents student;
	Map < String,String > hashMap = new HashMap<String,String>();
	@Before
	public void setup(){

		student = new MapStudents();
		hashMap.put("Ankita", "Kiwi");
		hashMap.put("Deepika", "Mango");
		hashMap.put("Advaita", "Strawberry");
		hashMap.put("Rubel", "Muskmelon");
		hashMap.put("Sameer", "Apple");
	}
	@Test
	public void testForGetFavouriteFruitByStudentName() {
			//student.getValueOfMap(hashMap);
			String result =student.getFavouriteFruitByStudentName("Ankita",hashMap);
			assertEquals("Kiwi",result);
			//student.printMapValueFavrouiteFruitSeparately(hashMap);
			}
	@Test 
	public void testForGetKeySeparately(){
		Set<String> result = student.printMapKeyStudentNameSeparately(hashMap);
		//assertEquals(hasKey,result);

		
	}
	}


