package com.foodland.service;

import com.foodland.model.FoodCart;

public interface CartService {

	public FoodCart addItemToCart(Integer itemId, String key);

	public FoodCart increaseQuantity(Integer itemId, Integer quantity, String key);

	public FoodCart reduceQuantity(Integer itemId, Integer quantity, String key);

	public FoodCart removeItem(Integer itemId, String key);

	public String clearCart(String key);
	
	public FoodCart viewCart(String key);


}
