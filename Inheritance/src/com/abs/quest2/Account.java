package com.abs.quest2;

public class Account 
{
	double balance;
	public Account(double balance) 
	{
		super();
	}
	void withdraw(double amount) {
		balance = (balance - amount);
	}

	void deposit(double amount) {
		balance = (balance - amount);
	}
	double getBalance()
	{
		return balance;
	}
}
