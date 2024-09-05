package com.over.quest2;

public class Messenger {
	 void sendMail(String message) {
	        System.out.println("Sending message: " + message);
	    }
	    void sendMail(String toUsername, String message) {
	        System.out.println("Sending message to " + toUsername + ": " + message);
	    }
	    void sendMail(String toUsername, String message, String subject) {
	        System.out.println("Sending message to " + toUsername + " with subject '" + subject + "': " + message);
	    }
}
