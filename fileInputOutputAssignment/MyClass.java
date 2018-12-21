package com.fileInputOutputAssignment;

import java.io.Serializable;
import java.util.ArrayList;

public class MyClass implements Serializable {

		private int rollNumber;
		private String studentName;
		public MyClass(int rollNumber, String studentName) {
			super();
			this.rollNumber = rollNumber;
			this.studentName = studentName;
		}
		@Override
		public String toString() {
			return "MyClass [rollNumber=" + rollNumber + ", studentName="
					+ studentName + "]";
		}
		

}
