package com.foodland.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodland.model.Address;
import com.foodland.model.User;
import com.foodland.service.UserServices;

@RestController
public class UserController {
	
	@Autowired
	UserServices uservice;
	
	
	@PostMapping("/user")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user){
		
		User u = uservice.addUser(user);
		
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
		
	}

}
