package com.foodland.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodland.model.FoodCart;

@Repository
public interface FoodCartDao extends JpaRepository<FoodCart, Integer> {

}
