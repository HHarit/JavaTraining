package com.basics.quest2;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank= new Bank(10000);
		
        System.out.println("Initial Balance:" + bank.getBalance());
        bank.deposit(500);
        System.out.println("Initial Balance:" + bank.getBalance());
        bank.withdraw(200);
        System.out.println("Initial Balance:" + bank.getBalance());
        double Balance = bank. getBalance();
        System.out.println("Balance:" + Balance);
	}

}
