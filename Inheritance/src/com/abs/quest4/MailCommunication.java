package com.abs.quest4;

public class MailCommunication extends Communication {
     
	public void sendMessage() {
		System.out.println("communication using mail service");
	}

	public String[] showTypes() {
		// Returning an array of strings with the specified types
		return new String[] { "email", "telegram", "letter" };
	}

}
