package com.basicCollectionsAssignment;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapStudents {


	public void getValueOfMap(Map<String, String> hashMap) {

		Set<Entry<String, String>> student = hashMap.entrySet();

		for (Entry<String, String> studentMap : student) {
			System.out.print(studentMap.getKey() + ":");
			System.out.println(studentMap.getValue());
		}
	}

	public String getFavouriteFruitByStudentName(String studentName, Map<String, String> hashMap) {

		String fruit = hashMap.get(studentName);
		System.out.println(fruit);
		return fruit;

	}

	public Set<String> printMapKeyStudentNameSeparately(Map<String, String> hashMap) {

		Set<String> keys = hashMap.keySet();

		for (String keySet : keys) {
			System.out.print(keySet + "\n");

		}
		return keys;

	}

	public void printMapValueFavrouiteFruitSeparately(Map<String, String> hashMap) {

		Set<Entry<String, String>> keys = hashMap.entrySet();
		for (Entry<String, String> valueSet : keys) {
			System.out.println(valueSet.getValue());
		}
	}
}
