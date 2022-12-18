package com.foodland.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.foodland.model.Address;
import com.foodland.model.User;
import com.foodland.service.UserServices;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	UserServices uservice;
	
	
	@PostMapping("/user")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user){
		
		User u = uservice.addUser(user);
		
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
		
	}

	@PutMapping("/user")
	public ResponseEntity<User> updateUserHandler(@Valid @RequestBody User user){

		User u = uservice.updateUser(user);

		return new ResponseEntity<User>(u,HttpStatus.CREATED);

	}

	@DeleteMapping("/user/{mobile}")
	public ResponseEntity<User> removeUserHandler(@Valid @PathVariable("mobile") String mobile){

		User u = uservice.removeUser(mobile);

		return new ResponseEntity<User>(u,HttpStatus.CREATED);

	}

	@GetMapping("/user/{mobile}")
	public ResponseEntity<User> viewUserHandler(@Valid @PathVariable("mobile") String mobile){

		User u = uservice.viewUser(mobile);

		return new ResponseEntity<User>(u,HttpStatus.CREATED);

	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> viewAllUserHandler(){

		return new ResponseEntity<List<User>>(uservice.viewAllUser(),HttpStatus.OK);

	}

}
