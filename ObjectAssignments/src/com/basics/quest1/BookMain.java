package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Book book1 = new Book("C#", "Paul", 550.0, "Fiction");
        Book book2 = new Book("F#", "Robert", 450.0, "Programming");

     
        book1.getDetails();
        book2.getDetails();
        book1.checkBookType();
        book2.checkBookType();
	}

}
