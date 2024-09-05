package com.max.abs;

public abstract class TeamLead extends Employee {

	public TeamLead(String empname, double salary, int empid) {
		super(empname, salary, empid);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calBonus(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Bonus" +salary+amount);
	}
	void ownmethod() {
		// TODO Auto-generated method stub
		System.out.println("My Method");
	}
}
