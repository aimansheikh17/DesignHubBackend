package com.example.demo.controller;


import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*") // Adjust if your frontend runs elsewhere
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping
    public String sendContact(@RequestBody Contact contact) {
        contactService.processContact(contact);
        return "Message sent successfully!";
    }
}
