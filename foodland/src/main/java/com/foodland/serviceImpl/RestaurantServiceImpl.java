package com.foodland.serviceImpl;

import com.foodland.exception.RestaurantException;
import com.foodland.model.Restaurant;
import com.foodland.repository.RestaurantDao;
import org.springframework.stereotype.Service;

import com.foodland.service.RestaurentService;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurentService {

	private RestaurantDao rd;

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) throws RestaurantException {
         if(restaurant==null){
			 throw new RestaurantException("Please Enter Valid Restaurant");
		 }else{
			return rd.save(restaurant);
		 }
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) throws RestaurantException {
		return null;
	}

	@Override
	public Restaurant removeRestaurant(Restaurant restaurant) throws RestaurantException {
		return null;
	}

	@Override
	public Restaurant viewRestaurant(Restaurant restaurant) throws RestaurantException {
		return null;
	}

	@Override
	public List<Restaurant> viewRestaurantByLocation(String location) throws RestaurantException {
		return null;
	}

	@Override
	public List<Restaurant> viewRestaurantsByItemName(String name) throws RestaurantException {
		return null;
	}
}
