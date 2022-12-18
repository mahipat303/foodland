package com.foodland.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
			@PathVariable("key") String key) {

		FoodCart cart = fco.addItemToCart(id, key);

		return new ResponseEntity<FoodCart>(cart, HttpStatus.CREATED);

	}
//	
	
	@PutMapping("/reduceQuantity/{id}/{key}/{quantity}")
	public ResponseEntity<FoodCart> reduceQuantityHandler(@PathVariable("id") Integer id,
			@PathVariable("key") String key,@PathVariable("quantity") Integer q) {

		FoodCart cart = fco.reduceQuantity(id, q, key);

		return new ResponseEntity<FoodCart>(cart, HttpStatus.CREATED);

	}
	
	@PutMapping("/increaseQuantity/{id}/{key}/{quantity}")
	public ResponseEntity<FoodCart> increaseQuantityHandler(@PathVariable("id") Integer id,
			@PathVariable("key") String key,@PathVariable("quantity") Integer q) {

		FoodCart cart = fco.increaseQuantity(id, q, key);

		return new ResponseEntity<FoodCart>(cart, HttpStatus.CREATED);

	}
	
	@DeleteMapping("/removefromcart/{id}/{key}")
	public ResponseEntity<FoodCart> removeItemHandler(@PathVariable("id") Integer id, @PathVariable("key") String key) {

		FoodCart cart = fco.removeItem(id, key);

		return new ResponseEntity<FoodCart>(cart, HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/clearcart/{key}")
	public ResponseEntity<String> clearCartHandler(@PathVariable("key") String key) {

		String message = fco.clearCart(key);

		return new ResponseEntity<String>(message, HttpStatus.ACCEPTED);

	}

}
