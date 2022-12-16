package com.foodland.service;

import com.foodland.exception.UserException;
import org.springframework.stereotype.Service;

import com.foodland.model.User;

@Service
public interface UserServices {


	public User addUser(User user)throws UserException;

	



}
