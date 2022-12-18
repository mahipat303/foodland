package com.foodland.controller;

import com.foodland.model.Restaurant;
import com.foodland.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
public class RestaurantController {
	@Autowired
	private RestaurentService rs;

	@PostMapping("/restaurant")
	public ResponseEntity<Restaurant> addRestaurant(@Valid @RequestBody Restaurant restaurant) {
		return new ResponseEntity<Restaurant>(rs.addRestaurant(restaurant), HttpStatus.CREATED);
	}

	@PutMapping("/restaurant/{key}")
	public Restaurant updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable("key") String key) {
		return rs.updateRestaurant(restaurant, key);
	}

	@PostMapping("/restaurants/{key}")
	public Restaurant deleteRestaurant(@RequestBody Restaurant restaurant, @PathVariable("key") String key) {
		return rs.removeRestaurant(restaurant, key);
	}

	@GetMapping("/restaurant/{key}")
	public Restaurant viewRestaurant(@RequestBody Restaurant restaurant, @PathVariable("key") String key) {
		return rs.removeRestaurant(restaurant, key);
	}

	@GetMapping("/restaurantsbylocation/{location}/{key}")
	public List<Restaurant> viewRestaurantByLocation(@PathVariable("location") String location,
			@PathVariable("key") String key) {
		return rs.viewRestaurantByLocation(location, key);
	}

	@GetMapping("/restaurantsbyname/{name}/{key}")
	public List<Restaurant> viewRestaurantByName(@PathVariable("name") String location,
			@PathVariable("key") String key) {
		return rs.viewRestaurantByLocation(location, key);
	}

}
