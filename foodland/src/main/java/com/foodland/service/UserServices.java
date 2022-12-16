package com.foodland.service;

import org.springframework.stereotype.Service;

import com.foodland.model.User;

@Service
public interface UserServices {

	public User addUser(User user)throws UserException;

}
