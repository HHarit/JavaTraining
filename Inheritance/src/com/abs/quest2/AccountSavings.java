package com.abs.quest2;

public class AccountSavings extends Account {

	double balance;
	public AccountSavings(double balance) {
		super(balance);

	}
	void withdraw(double amount) {
		balance = balance - amount - 50;
	}
 
	
	void deposit(double amount) {
		balance = balance + amount + 50;
	}
	
	double getBalance()
	{
		return balance;
	}
}
