package com.foodland.serviceImpl;

import com.foodland.exception.UserException;
import com.foodland.model.CurrentUserSession;
import com.foodland.repository.SessionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodland.model.User;
import com.foodland.repository.UserDao;
import com.foodland.service.UserServices;


@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	private UserDao udao;

	@Autowired
	private SessionDao sdao;
	
	@Override
	public User addUser(User user) {

		User existUser = udao.findByMobile(user.getMobile());

		if(existUser != null)
			throw new UserException("User Already registered");
		
		return udao.save(user);
	}

	@Override
	public User updateUser(User user) throws UserException {
		CurrentUserSession existUser = sdao.findByMobile(user.getMobile());

		if(existUser == null)
			throw new UserException("Plz login with this number : "+ user.getMobile());

		User user1 = udao.save(user);

		return user1;

	}

	@Override
	public User removeUser(String mobile) throws UserException {
		return null;
	}

	@Override
	public User viewUser(String mobile) throws UserException {
		return null;
	}

	@Override
	public User viewAllUser() throws UserException {
		return null;
	}

}
