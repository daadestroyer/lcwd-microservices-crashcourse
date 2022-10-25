package com.daadestroyer.userservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.daadestroyer.userservice.entity.User;

@Service
public class UserService {

	// fake user list
	List<User> list = Arrays.asList(
			new User(1311L, "Shubham Nigam", "1234567890"),
			new User(1312L, "Shubhanshu Arya", "1231231231"), 
			new User(1313L, "Ansh Gupta", "1234561234")
	);

	// get user by user id
	public User getUserByUserId(Long userId) {
		return this.list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
	}
	
	// get all user
	public List<User> getAllUser(){
		return this.list;
	}

}
