package com.daadestroyer.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.daadestroyer.userservice.entity.Contacts;
import com.daadestroyer.userservice.entity.User;
import com.daadestroyer.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUserByUserId(@PathVariable("userId") Long userId) {
		 User user = this.userService.getUserByUserId(userId);
		 
		 // http://localhost:1002/contact/contact/1311
		 List<Contacts> list = this.restTemplate.getForObject("http://contact-service:1002/contact/contact/"+userId, List.class);
		 
		 user.setContacts(list);
		 return user;
	}
	
	@GetMapping("/")
	public List<User> getAllUser() {
		return this.userService.getAllUser();
	}
}
