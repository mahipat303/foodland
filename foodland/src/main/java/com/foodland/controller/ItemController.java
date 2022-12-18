package com.foodland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodland.model.Item;
import com.foodland.model.Restaurant;
import com.foodland.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService is;

	@PostMapping("items/{key}")
	public ResponseEntity<Item> addItemByRestaurantHandler(@RequestBody Item item, @PathVariable("key") String key) {

		Item i = is.addItem(item, key);

		return new ResponseEntity<Item>(i, HttpStatus.CREATED);
	}
	
	@PutMapping("items/{key}")
	public ResponseEntity<Item> updateItemRestaurantHandler(@RequestBody Item item,@PathVariable("key") String key){
		Item i=is.updateItem(item, key);
		return new ResponseEntity<Item>(i,HttpStatus.OK);
	}
	
	@DeleteMapping("items/{key}")
	public ResponseEntity<Item> removeItemRestaurantHandler(@PathVariable("id") Integer id,@PathVariable("key") String key){
		Item i=is.removeItem(id, key);
		
		return new ResponseEntity<Item>(i,HttpStatus.OK);
	}
	
	@GetMapping("items/{key}")
	public ResponseEntity<Item> viewItemByRestaurantHandler(@PathVariable("id") Integer id,@PathVariable("key") String key){
		Item i=is.viewItem(id, key);
		return new ResponseEntity<Item>(i,HttpStatus.OK);
	}

	@GetMapping("items/{key}")
	public  ResponseEntity<List<Item>> viewItemByCategory(@PathVariable("id") Integer id,@PathVariable("key") String key){
		
		
		return new ResponseEntity<List<Item>>(is.viewAllItemBycategory(id, key),HttpStatus.OK);
	}
	@GetMapping("items/{key}")
	public ResponseEntity<List<Item>> viewItemByName(@PathVariable("id") String name,@PathVariable("key") String key){
		
		return new ResponseEntity<List<Item>>(is.viewAllItemByName(name, key),HttpStatus.OK);
		
	
	}
	
	@GetMapping("items/{key}")
	public ResponseEntity<List<Item>> viewItemByRestaurant(@PathVariable("id") Integer id,@PathVariable("key") String key){
		return new ResponseEntity<List<Item>>(is.viewAllItemByRestaurant(id , key),HttpStatus.OK);
	}
	
}
