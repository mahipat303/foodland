package com.foodland.service;

import com.foodland.exception.RestaurantException;
import com.foodland.model.OrderDetail;

public interface OrderDetailService {

	public OrderDetail addDetails(String key);

	public String cancelOrderByRestaurant(Integer orderId, String key) throws RestaurantException;
	
	public String cancelOrderByCustomer(Integer orderId, String key);
	
	public OrderDetail acceptOrderByRestaurant(Integer orderId, String key) throws RestaurantException;
	


}
