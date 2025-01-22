package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.user.entity.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findById(int uid);
	List<User> findAll();
}
