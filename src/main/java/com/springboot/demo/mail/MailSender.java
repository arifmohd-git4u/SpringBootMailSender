package com.springboot.demo.mail;

public interface MailSender {
	void send(String to, String subject, String body);
}
