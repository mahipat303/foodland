package com.foodland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodland.model.Restaurant;

public interface RestaurantDao extends JpaRepository<Restaurant, Integer>{

}
