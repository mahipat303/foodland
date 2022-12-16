package com.foodland.controller;

import com.foodland.model.Restaurant;
import com.foodland.service.RestaurentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
	private RestaurentService rs;
	@PostMapping("/restaurant")
	public Restaurant addRestaurant( @RequestBody Restaurant restaurant){
		return rs.addRestaurant(restaurant);
	}
	@PutMapping("restaurant/{key}")
	public Restaurant updateRestaurant( @RequestBody Restaurant restaurant,@PathVariable("key") String key){
		return rs.updateRestaurant(restaurant,key);
	}
	@PostMapping("restaurant/{key}")
	public Restaurant deleteRestaurant( @RequestBody Restaurant restaurant,@PathVariable("key") String key){
		return rs.removeRestaurant(restaurant,key);
	}

	@GetMapping("restaurant/{key}")
	public Restaurant viewRestaurant( @RequestBody Restaurant restaurant,@PathVariable("key") String key){
		return rs.removeRestaurant(restaurant,key);
	}

	@GetMapping("restaurantsbylocation/{location}/{key}")
	public List<Restaurant> viewRestaurantByLocation(@PathVariable("location") String location, @PathVariable("key") String key){
		return rs.viewRestaurantByLocation(location,key);
	}

	@GetMapping("restaurantsbyname/{name}/{key}")
	public List<Restaurant> viewRestaurantByName(@PathVariable("name") String location, @PathVariable("key") String key){
		return rs.viewRestaurantByLocation(location,key);
	}

}
