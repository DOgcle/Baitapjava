package com.tai.inheritance;

public class Programmer extends Employee {
	private String theLanguage;

	public Programmer( String theName,int thePayrollNumber, int theMonthlySalary, String theLanguage) {
		super(theName, theMonthlySalary, thePayrollNumber);
		this.setTheLanguage(theLanguage);
	}

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}

	void display() {
		super.display();
		System.out.println("The Language:\t" + theLanguage);

	}
}
