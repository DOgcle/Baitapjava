package com.tai.inheritance;

public class Main {
		public static void main(String[] args) {
			Programmer a = new Programmer("Bob",1000,2000,"C++");
			Programmer b= new Programmer("John",1200,5000,"C#");
			Programmer c= new Programmer("Ken",2000,3000,"Java");
			ProjectLeader d= new ProjectLeader("Peter",1000,2000,"C++");
			SoftwareHouse  sh = new SoftwareHouse("Samsung");
			
			 
			d.addEmployee(d);
			d.addEmployee(a);
			d.addEmployee(c);
			d.displayTeam();
			sh.addStaff(a);
			sh.addStaff(b);
			sh.addStaff(c);
			sh.addStaff(d);
			sh.display();
			
		
			
		}

}
