package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {

	User getUser(int uid);
	
	List<User> getAllUsers();
}
