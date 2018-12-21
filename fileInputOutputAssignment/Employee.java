package com.fileInputOutputAssignment;

import java.io.Serializable;

public class Employee implements Serializable {

	private double salary;
	private String employeeName;
	private int employeeId;

	public Employee(int employeeId, String employeeName, double  salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", employeeName=" + employeeName
				+ ", employeeId=" + employeeId + "]";
	}

}
