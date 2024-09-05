package com.abs.quest2;

public class Current extends Account {
	double balance;
	
	public Current(double balance) 
	{
		super(balance);
		
	}
	
	void withdraw(double amount) {
		balance = balance - amount - 25;
	}
 
	
	void deposit(double amount) {
		balance = balance + amount + 20;
	}

	double getBalance() {
		return balance;
	}

}
