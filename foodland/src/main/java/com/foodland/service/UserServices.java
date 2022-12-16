package com.foodland.service;

import com.foodland.exception.UserException;
import org.springframework.stereotype.Service;

import com.foodland.exception.UserException;
import com.foodland.model.User;

@Service
public interface UserServices {


	public User addUser(User user)throws UserException;

	


	public User updateUser(User user)throws UserException;

	public User removeUser(String mobile)throws UserException;

	public User viewUser(String mobile)throws UserException;

	public User viewAllUser()throws UserException;




}
