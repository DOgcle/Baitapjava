package com.tai.inheritance;

import java.util.ArrayList;
import java.util.List;

public class ProjectLeader extends Programmer {

	private List<Programmer> theTeam;

	public List<Programmer> getTheTeam() {
		return theTeam;
	}

	public void setTheTeam(List<Programmer> theTeam) {
		this.theTeam = theTeam;
	}

	public ProjectLeader(String theName,int thePayrollNumber, int theMonthlySalary,  String theLanguage) {
		super(theName, theMonthlySalary, thePayrollNumber, theLanguage);
		this.theTeam = new ArrayList<>();
	}

	void addEmployee(Programmer programmer) {
		theTeam.add(programmer);
	}

	void displayTeam() {
		System.out.println(" The Team of "+ this.getTheName() );
		for (Programmer p : theTeam) {
			p.display();
		}
	}

}
