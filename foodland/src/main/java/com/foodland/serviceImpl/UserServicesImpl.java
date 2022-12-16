package com.foodland.serviceImpl;

import com.foodland.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodland.model.User;
import com.foodland.repository.UserDao;
import com.foodland.service.UserServices;


@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	UserDao udao;
	
	@Override
	public User addUser(User user) {

		User exsitUser = udao.findByMobile(user.getMobile());

		if(exsitUser != null)
			throw new UserException("User Already registered");
		
		return udao.save(user);
	}

}
