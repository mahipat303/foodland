package com.foodland.service;

import com.foodland.exception.BillException;
import com.foodland.exception.UserException;
import com.foodland.model.Bill;

public interface BillService {
	
	public Bill viewBill(String Key) throws BillException,UserException;

}
