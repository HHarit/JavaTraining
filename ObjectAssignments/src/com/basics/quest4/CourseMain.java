package com.basics.quest4;

public class CourseMain {

	public static void main(String[] args) {
		  Training objTraining = new Training();
		  for (String courseName : objTraining.showCourses()) {
	            System.out.println(courseName);
	        }
	        System.out.println();
		 
		  objTraining.showTrainers("Rohan", "Sathya");
		  objTraining.showTrainers();
		  
		  
	}
}
