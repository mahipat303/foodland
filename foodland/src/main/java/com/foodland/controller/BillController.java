package com.foodland.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.foodland.model.Bill;
import com.foodland.service.BillService;

@RestController
public class BillController {

	@Autowired
	private BillService billService;

	@GetMapping("bill/{key}")
	public ResponseEntity<Bill> viewBill(@PathVariable("key") String key) {

		return new ResponseEntity<Bill>(billService.viewBill(key), HttpStatus.OK);

	}

}
