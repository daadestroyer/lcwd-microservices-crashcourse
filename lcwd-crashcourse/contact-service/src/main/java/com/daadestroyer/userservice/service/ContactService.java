package com.daadestroyer.userservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.daadestroyer.userservice.entity.Contacts;

@Service
public class ContactService {

	List<Contacts> contacts = Arrays.asList(new Contacts(1L, "pulkit@gmail.com", "Pulkit Nagar", 1311L),
			new Contacts(2L, "vatsal@gmail.com", "Vatsal Patel", 1311L),
			new Contacts(3L, "anshul@gmail.com", "Anshul Goyal", 1312L),
			new Contacts(4L, "saurav@gmail.com", "Saurav Kumar", 1311L),
			new Contacts(4L, "nirbhay@gmail.com", "Nirbhay Patel", 1312L),
			new Contacts(4L, "madhurya@gmail.com", "Madhurya Mahadev", 1313L));

	// get contacts by id
	public List<Contacts> getContactsById(Long userId) {
		return this.contacts.stream().filter(contacts -> contacts.getUserId().equals(userId))
				.collect(Collectors.toList());
	}

	// get all contacts

	public List<Contacts> getAllContacts() {
		return this.contacts;
	}
}
