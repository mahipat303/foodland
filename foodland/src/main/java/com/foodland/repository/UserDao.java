package com.foodland.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodland.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	
}
