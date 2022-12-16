package com.foodland.service;

import com.foodland.model.OrderDetail;

public interface OrderDetailService {

	public OrderDetail addDetails(String key);

	public String cancelOrder(Integer orderId, String key);

}
