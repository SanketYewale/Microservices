package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactMicroserviceApplication.class, args);
		
		System.out.println("Spring Boot Contact Micro service Started");
	}

}
