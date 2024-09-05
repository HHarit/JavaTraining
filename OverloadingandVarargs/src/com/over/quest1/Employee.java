package com.over.quest1;

public class Employee {
	  private String name;
	    private String designation;

	    public Employee(String name, String designation) {
	        this.name = name;
	        this.designation = designation;
	    }

	    public double calcBonus(double basicAllowance) {
	       
	        return basicAllowance * 0.1; 
	    }

	    public double calcBonus(double basicAllowance, double carAllowance) {
	        
	        return (basicAllowance + carAllowance) * 0.15; 
	    }

	    public double calcBonus(double basicAllowance, double carAllowance, double housingAllowance) {

	        return (basicAllowance + carAllowance + housingAllowance) * 0.2; 
	    }

	    public String getDesignation() {
	        return designation;
	    }
}