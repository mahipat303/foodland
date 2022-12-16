package com.foodland.repository;

import com.foodland.exception.RestaurantException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.foodland.exception.UserLoginException;
import com.foodland.model.Restaurant;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Queue;

public interface RestaurantDao extends JpaRepository<Restaurant, Integer>{

	public Restaurant findByMobile(String mobile) throws UserLoginException;
	@Query("select c from Restaurant c where c.address.city=?1")
	public List<Restaurant> findByAddress(String address) throws RestaurantException;
	public List<Restaurant> findByItems(String name) throws RestaurantException;

}
