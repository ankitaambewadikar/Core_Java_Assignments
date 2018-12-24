package com.basicCollectionsAssignment;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentNamesByorder {

	private String studentName;

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]" + "\n";
	}

	public String printArrayElements(List<String> students) {
		for (String studentNames : students) {
			System.out.println(studentNames);
		}
		System.out.println(students);
		return studentName;
	}

	public void sortArrayList(List<String> students) {
		Set<String> sorted = new TreeSet<>(students);
		System.out.println(sorted);

	}
}
