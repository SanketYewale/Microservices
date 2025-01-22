package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;


public interface ContactService {

	Contact getContact(int cId);
	
	List<Contact> getAllContacts();
	
	List<Contact> getContactsOfUser(int userId);
}
