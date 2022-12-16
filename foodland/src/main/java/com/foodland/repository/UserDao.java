package com.foodland.repository;

import com.foodland.exception.UserException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodland.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	public User findByMobile(String mobile) throws UserException;
}
