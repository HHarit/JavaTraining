package com.basics.quest4;

public class Training {


	

	String[] showCourses() {
		return new String[] { "Java", ".Net", "React" };
	}

	public void showTrainers(String... names) {
		for (String name : names) {

			System.out.println("Names =" + name);
		}
	}
}
