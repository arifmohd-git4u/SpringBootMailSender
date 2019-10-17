package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.mail.MailSender;

@RestController
public class MailController {
	private MailSender mailSender;

	@Autowired
	public MailController(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@RequestMapping("/mail")
	public String mail() {
		mailSender.send("explore.mohd.arif8810@gmail.com", "Spring Boot",
				"Learning Spring Boot 2 and trust me it is amazing");
		return "Mail has been Sent!!";
	}
}
