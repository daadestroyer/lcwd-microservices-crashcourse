package com.daadestroyer.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);

		System.out.println("---------------");
		System.out.println("STARTED");
		System.out.println("---------------");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
