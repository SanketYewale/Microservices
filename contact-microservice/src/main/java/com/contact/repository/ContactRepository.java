package com.contact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.contact.entity.Contact;

@Transactional
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	Contact findById(int uid);
	List<Contact> findAll();

	@Query(value = "From Contact c where c.userId = :userId")
	List<Contact> getAllContactsOfUser(@Param("userId") int userId);
}
