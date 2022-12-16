package com.foodland.serviceImpl;

import com.foodland.exception.RestaurantException;
import com.foodland.model.Restaurant;
import com.foodland.repository.RestaurantDao;
import org.springframework.stereotype.Service;

import com.foodland.service.RestaurentService;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurentService {


	@Override
	public Restaurant addRestaurant(Restaurant restaurant) throws RestaurantException {
		return null;
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant, String key) throws RestaurantException {
		return null;
	}

	@Override
	public Restaurant removeRestaurant(Restaurant restaurant, String key) throws RestaurantException {
		return null;
	}

	@Override
	public Restaurant viewRestaurant(Restaurant restaurant, String key) throws RestaurantException {
		return null;
	}

	@Override
	public List<Restaurant> viewRestaurantByLocation(String location, String key) throws RestaurantException {
		return null;
	}

	@Override
	public List<Restaurant> viewRestaurantsByItemName(String name, String key) throws RestaurantException {
		return null;
	}
}
