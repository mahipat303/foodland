package com.foodland.service;

import java.util.List;

import com.foodland.exception.ItemException;
import com.foodland.exception.RestaurantException;
import com.foodland.model.Category;
import com.foodland.model.Item;

public interface ItemService {

	public Item addItem(Item item, String key) throws ItemException, RestaurantException;

	public Item updateItem(Item item, String key) throws ItemException, RestaurantException;

	public Item viewItem(Integer id, String key) throws ItemException, RestaurantException;

	public Item removeItem(Integer id, String key) throws ItemException, RestaurantException;

	public List<Item> viewAllItemBycategory(Integer id, String userkey) throws ItemException, RestaurantException;
	
	public List<Item> viewAllItemByName(String name,String key) throws ItemException, RestaurantException;
	
	public List<Item> viewAllItemByRestaurant(Integer id,String key) throws ItemException, RestaurantException;

	
	
}
