package com.basics.quest2;

public class Bank {
	double balance;
	Bank(double balance)
	{
		this.balance= balance;
	}
	void withdraw(double amount) 
	{
	 this.balance =  balance - amount;
	}
	void deposit(double amount) 
	{
		 this.balance =  balance + amount;
	}
   double getBalance()
   {
	   
	  return balance;
   }
}
