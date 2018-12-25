package com.advancedCollectionAssignment.Employee_InformationAndMMSavingAccount;

public class EmployeeInformation {

	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private double salary;
	public EmployeeInformation(int employeeId, String employeeName, String employeeDesignation, double salary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeInformation [employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", salary=" + salary + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
