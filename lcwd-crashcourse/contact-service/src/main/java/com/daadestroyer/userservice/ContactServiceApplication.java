package com.daadestroyer.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactServiceApplication.class, args);
		System.out.println("---------------");
		System.out.println("STARTED");
		System.out.println("---------------");
	}

}
