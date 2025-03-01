package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;

@Service
public class MailService {

	

    @Autowired
    JavaMailSender mailSender;

    public void sendContactEmail(Contact contact) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("mohammedaiman2001@gmail.com"); // Replace with your receiving email address
        message.setSubject("New Message from " + contact.getName());
        String emailText = "name: " + contact.getName() + "\n" +
                           "email: " + contact.getEmail() + "\n" +
                           "message: " + contact.getMessage();
        message.setText(emailText);
        mailSender.send(message);
    }
}
