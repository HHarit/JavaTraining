package com.basics.quest3;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String name2 = "Alice";
	        String department2 = "Maths";
	        int[] marks2 = {95, 88, 91, 87}; 
	        Student student = new Student(name2, department2);
	        System.out.println();
	        System.out.println("\nDetails and grades for the student:");	      
	        System.out.println("Grade: " + student.getGrades(marks2));
	}

}
