package com.basics.quest5;

public class Mobile {
	String model;
	String brand;
	String color;

	public Mobile(String model, String brand, String color) {
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	
	public String getDetails() {
        return "Brand: " + brand + ", Model: " + model + ", color: " + color;
    }


    public String getModel() {
        return model;
    }
}
