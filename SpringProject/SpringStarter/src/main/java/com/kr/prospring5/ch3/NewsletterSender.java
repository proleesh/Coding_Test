package com.kr.prospring5.ch3;

public interface NewsletterSender {
	void setSmtpServer(String smtpServer);
	String getSmtpServer();
	void setFormAddress(String fromAddress);
	String getFromAddress();
	
	void send();

}
