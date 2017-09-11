package com.techelevator;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;
	
	//constructor
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId=employeeId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.annualSalary=salary;
	}
	
	//method
	public void raiseSalary(double percent) {
		percent = percent/100;
		annualSalary = annualSalary * (1.0 + percent);
	}
	
	//getters and setters
	public String getFullName() {
		return lastName + ", " + firstName;
	}	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
}
