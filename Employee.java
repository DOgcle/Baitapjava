package com.tai.inheritance;

public abstract class Employee {
	private int thePayrollNumber;
	private int theMonthlySalary;
	private String theName;
	public Employee(String theName, int thePayrollNumber, int theMonthlySalary) {
		
		this.setThePayrollNumber(thePayrollNumber);
		this.setTheMonthlySalary(theMonthlySalary);
		this.setTheName(theName);
	}
	public int getThePayrollNumber() {
		return thePayrollNumber;
	}
	public void setThePayrollNumber(int thePayrollNumber) {
		this.thePayrollNumber = thePayrollNumber;
	}
	public int getTheMonthlySalary() {
		return theMonthlySalary;
	}
	public void setTheMonthlySalary(int theMonthlySalary) {
		this.theMonthlySalary = theMonthlySalary;
	}
	public String getTheName() {
		return theName;
	}
	public void setTheName(String theName) {
		this.theName = theName;
	}
	void display() {
		System.out.println("First Name:\t" + theName);
		System.out.println("Payroll Number:\t" +thePayrollNumber);
		System.out.println("Monthly Salary:\t" +theMonthlySalary);
		
		}


}
