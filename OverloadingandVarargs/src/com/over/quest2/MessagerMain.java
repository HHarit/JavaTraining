package com.over.quest2;

public class MessagerMain {

	public static void main(String[] args) {

        Messenger messenger = new Messenger();

       
        messenger.sendMail("Jane");
        messenger.sendMail("john", "Hello, John");
        messenger.sendMail("janee", "Hello, Jane", "Important Update");

	}

}
