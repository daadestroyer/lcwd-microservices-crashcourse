package com.daadestroyer.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daadestroyer.userservice.entity.Contacts;
import com.daadestroyer.userservice.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	
	@Autowired
	private ContactService contactService;
	
	
	@GetMapping("/contact/{userId}")
	public List<Contacts> getContactsByUserId(@PathVariable("userId") Long userId){
		return this.contactService.getContactsById(userId);
	}
	
	@GetMapping("/")
	public List<Contacts> getAllContacts(){
		return this.contactService.getAllContacts();
	}
}
