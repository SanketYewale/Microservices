package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceImpl serviceimpl;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		
		User user = serviceimpl.getUser(userId);
		
		//http://localhost:9002/contact/contactsofuser/103
		List<Contact> list = restTemplate.getForObject("http://contact-microservice:9002/contact/contactsofuser/"+user.getUserId(), List.class);
		
		user.setContatctsList(list);
		
		return user;
	}
	
	@GetMapping("")
	public List<User> getUser() {
		
		List<User> userList =  serviceimpl.getAllUsers();
		
//		//http://localhost:9002/contact/contactsofuser/103
		for(User user:userList) {
			
			List<Contact> list = restTemplate.getForObject("http://contact-microservice:9002/contact/contactsofuser/"+user.getUserId(), List.class);
			
			user.setContatctsList(list);

		}
		
		return userList;
				
	}
}
