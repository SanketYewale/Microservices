package com.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository repository;

	@Override
	public Contact getContact(int cid) {
		
		return repository.findById(cid);
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Contact> getContactsOfUser(int userId) {
		// TODO Auto-generated method stub
		return repository.getAllContactsOfUser(userId);
	}
}
