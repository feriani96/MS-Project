package com.spring.verifyemail.services;

import com.spring.verifyemail.models.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private JavaMailSender javaMailSender;

    @Autowired
    public EmailService ( JavaMailSender javaMailSender) {
        this.javaMailSender= javaMailSender;
    }

    public void sendMessageByMail(Mail mail) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("sender@gmail.com");
        simpleMailMessage.setTo(mail.getTo());
        simpleMailMessage.setSubject(mail.getHeader());
        simpleMailMessage.setText(mail.getText());
        javaMailSender.send(simpleMailMessage);

    }
}
