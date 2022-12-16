package com.foodland.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodland.model.FoodCart;
import com.foodland.repository.FoodCartDao;
import com.foodland.service.CartService;

@RestController
public class FoodCartController {

	@Autowired
	private CartService fco;

	@PostMapping("/addtocart/{id}/{key}")
	public ResponseEntity<FoodCart> addItemToCartHandler(@PathVariable("id") Integer id,
			@PathVariable("id") String key) {

		FoodCart cart = fco.addItemToCart(id, key);

		return new ResponseEntity<FoodCart>(cart, HttpStatus.CREATED);

	}

}
