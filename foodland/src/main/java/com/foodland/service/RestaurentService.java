package com.foodland.service;

import com.foodland.exception.RestaurantException;
import com.foodland.model.Restaurant;

import java.util.List;

public interface RestaurentService {
	public Restaurant addRestaurant(Restaurant restaurant) throws RestaurantException;
	public Restaurant updateRestaurant(Restaurant restaurant) throws RestaurantException;
	public Restaurant removeRestaurant(Restaurant restaurant) throws RestaurantException;
	public Restaurant viewRestaurant(Restaurant restaurant) throws RestaurantException;
	public List<Restaurant> viewRestaurantByLocation(String location) throws RestaurantException;
	public List<Restaurant> viewRestaurantsByItemName(String name) throws RestaurantException;
}
