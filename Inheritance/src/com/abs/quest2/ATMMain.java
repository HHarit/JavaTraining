package com.abs.quest2;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			Account account = new AccountSavings(1000);
			account.deposit(500);
			account.withdraw(200);
			double savingbalance = account.getBalance();
			System.out.println(savingbalance);
	 
			Account currentAccount = new Current(1000);
			currentAccount.deposit(500);
			currentAccount.withdraw(200);
			double currentbalance = currentAccount.getBalance();
			System.out.println(currentbalance);
		}
	}


