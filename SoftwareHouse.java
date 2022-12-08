package com.tai.inheritance;

import java.util.ArrayList;

public class SoftwareHouse {
	private String Name;
	
	private ArrayList<Employee> theEmployee;
	public SoftwareHouse(String Name) {
		this.setName(Name);
		this.theEmployee=new ArrayList<>();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	void addStaff(Employee employee) {
		theEmployee.add(employee);
	} 
	void display() {
		System.out.println("The staff list of "+ this.getName());
		for(Employee e:theEmployee) {
			e.display();
		}
	}

}
