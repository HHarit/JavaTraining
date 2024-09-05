package com.max.abs;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Emp = new Manager("Joe", 50, 5000);
		Emp.calBonus(2);
		Emp.showCourses();
		Emp.showProjects();
		Emp.showRules();

		Manager Man = (Manager) Emp;
		Man.ownmethod();

		Developer Dev = (Developer) Emp;
		Dev.showProjects();
		Dev.showRules();

	}

}
