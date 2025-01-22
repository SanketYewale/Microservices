package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactServiceImpl;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactServiceImpl contactimpl;
	
	@GetMapping("/{cid}")
	public Contact getContact(@PathVariable("cid") int cid) {
		
		return contactimpl.getContact(cid);
		
	}
	
	@GetMapping("/allcontacts")
	public List<Contact> getAllContacts() {
		
		return contactimpl.getAllContacts();
		
	}
	
	
	@GetMapping("/contactsofuser/{userid}")
	public List<Contact> getContactsOfUser(@PathVariable("userid") int userid) {
		
		return contactimpl.getContactsOfUser(userid);
		
	}
	
}
