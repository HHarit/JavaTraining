package com.max.abs;

public class Developer extends TeamLead {
	String[] hobbies;
	String sportsName;

	public Developer(String empname, double salary, int empid, String... hobbies) {
		super(empname, salary, empid);
		// TODO Auto-generated constructor stub
	}

	@Override
	void showProjects() {
		System.out.println("Active Projects");
	}
	
	String[] hobbies() {
	        return new String[]{"Play", "Skip", "Read"};
	    }

	void showhobbies() {

		for (String string : hobbies) {
			System.out.println("Hobbies" + string);
		}

	}
}
