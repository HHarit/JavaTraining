package com.max.abs;

public abstract class Employee {
	String empname;
	double salary;
	int empid;
	public Employee(String empname, double salary, int empid) {
		super();
		this.empname = empname;
		this.salary = salary;
		this.empid = empid;
	}

	
	final String COMPANYNAME = "MAXIMUS";

	abstract void calBonus(double amount);

	String[] showCourses() {
		return new String[] {"Java", ".Net","SQL"};
	}

	abstract void showProjects();

	final void showRules() {
		System.out.println("leave Policy ");
	}

	private void officeHours() {
		System.out.println("10hours Per day");
	}

}
