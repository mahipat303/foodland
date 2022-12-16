package com.foodland.service;

import com.foodland.exception.ItemException;
import com.foodland.exception.RestaurantException;
import com.foodland.model.Item;

public interface ItemService {

	public Item addItem(Item item, String key) throws ItemException, RestaurantException;

	public Item updateItem(Item item, String key) throws ItemException, RestaurantException;

	public Item viewItem(Integer id, String key) throws ItemException, RestaurantException;

	public Item removeItem(Integer id, String key) throws ItemException, RestaurantException;

	public Item viewAllItemBycategory(Integer id, String userkey) throws ItemException, RestaurantException;
	
}
