package com.basics.quest5;


public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Mobile[] mobileArray = new Mobile[3];
	        mobileArray[0] = new Mobile("Apple", "iPhone", "128GB");
	        mobileArray[1] = new Mobile("Samsung", "Galaxy", "256GB");
	        mobileArray[2] = new Mobile("Google", "Pixel", "128GB");

	        System.out.println("Mobile Details:");
	        for (Mobile mobile : mobileArray) {
	            System.out.println(mobile.getDetails());
	        }
	        System.out.println();

	        System.out.println("Mobile Models:");

		       System.out.println("\nMobiles with brand Samsung:");
		        for (Mobile mobile : mobileArray) {
		            if (mobile.getModel().equals("Samsung")) {
		                mobile.getDetails();
		            }
		        
	    }
	}
}