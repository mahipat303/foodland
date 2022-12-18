package com.foodland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodland.model.OrderDetail;
import com.foodland.service.OrderDetailService;

@RestController
public class OrderDetailController {

	@Autowired
	private OrderDetailService ods;

	@PostMapping("addorder/{key}")
	public ResponseEntity<OrderDetail> addDetailsHandler(@PathVariable("key") String key) {

		return new ResponseEntity<OrderDetail>(ods.addDetails(key), HttpStatus.CREATED);

	}

	@DeleteMapping("cancelOrderByRestaurant/{id}/{key}")
	public ResponseEntity<String> cancelOrderByRestaurantHandler(@PathVariable("id") Integer orderId,
			@PathVariable("key") String key) {

		return new ResponseEntity<String>(ods.cancelOrderByRestaurant(orderId, key), HttpStatus.ACCEPTED);

	}

	@DeleteMapping("cancelOrderBycustomer/{id}/{key}")
	public ResponseEntity<String> cancelOrderByCustomerHandler(@PathVariable("id") Integer orderId,
			@PathVariable("key") String key) {

		return new ResponseEntity<String>(ods.cancelOrderByCustomer(orderId, key), HttpStatus.ACCEPTED);

	}

	@PutMapping("acceptOrderByRestaurant/{id}/{key}")
	public ResponseEntity<OrderDetail> acceptOrderByRestaurantHandler(@PathVariable("id") Integer orderId,
			@PathVariable("key") String key) {

		return new ResponseEntity<OrderDetail>(ods.acceptOrderByRestaurant(orderId, key), HttpStatus.OK);

	}

	@GetMapping("viewAllOrderByRestaurant/{key}")
	public ResponseEntity<List<OrderDetail>> viewAllOrderByRestaurantHandler(@PathVariable("key") String key) {

		return new ResponseEntity<List<OrderDetail>>(ods.viewAllOrderByRestaurant(key), HttpStatus.OK);

	}

	@GetMapping("viewAllOrderByCustomer/{key}")
	public ResponseEntity<List<OrderDetail>> viewAllOrderByCustomerHandler(@PathVariable("key") String key) {

		return new ResponseEntity<List<OrderDetail>>(ods.viewAllOrderByCustomer(key), HttpStatus.OK);

	}

}
