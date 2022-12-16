package com.foodland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodland.exception.UserLoginException;
import com.foodland.model.Restaurant;

public interface RestaurantDao extends JpaRepository<Restaurant, Integer>{

	public Restaurant findByMobile(String mobile) throws UserLoginException;

}
