package com.basics.quest1;

public class Book {
	String title;
	String author;
	double price;
	String category;

	Book(String title, String author, double price, String category) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	  public void getDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	        System.out.println("Category: " + category);
	    }
 public	void  checkBookType(){
		  if(price>500)
		  {
			  System.out.println("premium books");
			  
		  }
		  else
		  {
			  System.out.println("premium books");
			  
		  }
		  
	  }
}
