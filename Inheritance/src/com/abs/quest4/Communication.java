package com.abs.quest4;

public class Communication {
	public static void main(String[] args) {
	
		MailCommunication mail = (MailCommunication) communicationInMail;
		for (String type : mail.showTypes()) {
			System.out.println("Mail type : "+type);
		}
 
		Communication sms = new SMSCommunication();
		sms.sendMessage();
		SMSCommunication smsClass = (SMSCommunication) sms;
		smsClass.messageLenght();
 
		Communication Phone = new PhoneCommunication();
		Phone.sendMessage();
		PhoneCommunication phone = (PhoneCommunication) Phone;
		phone.callService();
 
		Communication WhatsApp = new WhatsppCommunication();
		WhatsApp.sendMessage();
		WhatsppCommunication whatsup = (WhatsppCommunication) WhatsApp;
		whatsup.otherFeatures();
	}

}
