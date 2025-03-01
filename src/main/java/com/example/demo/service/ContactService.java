package com.example.demo.service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;
    
    @Autowired
    private MailService mailService;

    public void processContact(Contact contact) {
        // Save the contact details in the database
        contactRepository.save(contact);
        
        // Send an email notification
        mailService.sendContactEmail(contact);
    }
}



