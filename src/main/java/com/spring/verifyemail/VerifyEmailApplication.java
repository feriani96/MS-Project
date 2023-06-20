package com.spring.verifyemail;

import com.spring.verifyemail.models.Mail;
import com.spring.verifyemail.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class VerifyEmailApplication {

	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(VerifyEmailApplication.class, args);
	}
	

	@EventListener(ApplicationReadyEvent.class)
	public void sendCV(){
		Mail mail = new Mail();
		mail.setHeader("CV");
		mail.setTo("receiver@gmail.com");
		mail.setText("Hello from yasmine");
		emailService.sendMessageByMail(mail);
		System.out.println(mail);
		System.out.println("Success");
	}



}
