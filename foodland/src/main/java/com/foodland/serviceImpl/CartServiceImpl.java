package com.foodland.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodland.model.FoodCart;
import com.foodland.repository.FoodCartDao;
import com.foodland.service.CartService;

public class CartServiceImpl implements CartService {
	
	@Autowired
	private FoodCartDao fdo;
	

	@Override
	public FoodCart addItemToCart(Integer itemId, String key) {
		
		
		
		
		
		return null;
	}

	@Override
	public FoodCart increaseQuantity(Integer itemId, Integer quantity, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCart reduceQuantity(Integer itemId, Integer quantity, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCart removeItem(Integer itemId, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String clearCart(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
