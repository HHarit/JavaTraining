package com.over.quest4;

public class GreeterMain {
	
	public static void main(String[] args) {
		Greeter obj = new Greeter("Sara");
		obj.greetUser("welcome","Great day"); 
		obj.greetUser("Good Day","Have Tea","Enjoy Learning");

		
		obj.sayHello("Sri","Priya");
		obj.sayHello("Sara","Anna","Reena","Rohan");
		obj.sayHello("Jo","Roni");
		}

}