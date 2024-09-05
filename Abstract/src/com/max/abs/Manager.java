package com.max.abs;

public class Manager extends Employee {

	public Manager(String empname, double salary, int empid) {
		super(empname, salary, empid);
	}

	@Override
	void calBonus(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Bonus=  " + amount);

	}

	@Override
	void showProjects() {
		// TODO Auto-generated method stub
		System.out.println("Active Projects");


	}
	
	void ownmethod()
	{
		System.out.println("My Own method - Manager Class");

	}

}
