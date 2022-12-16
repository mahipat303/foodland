package com.foodland.service;

import com.foodland.exception.RestaurantException;
import com.foodland.model.Restaurant;

import java.util.List;

public interface RestaurentService {
	public Restaurant addRestaurant(Restaurant restaurant) throws RestaurantException;
	public Restaurant updateRestaurant(Restaurant restaurant,String key) throws RestaurantException;
	public Restaurant removeRestaurant(Restaurant restaurant,String key) throws RestaurantException;
	public Restaurant viewRestaurant(Restaurant restaurant,String key) throws RestaurantException;
	public List<Restaurant> viewRestaurantByLocation(String location,String key) throws RestaurantException;
	public List<Restaurant> viewRestaurantsByItemName(String name,String key) throws RestaurantException;
}
