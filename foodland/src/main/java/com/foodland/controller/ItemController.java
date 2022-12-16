package com.foodland.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

}
