package com.foodland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodland.model.Bill;
import com.foodland.model.User;

public interface BillDao extends JpaRepository<Bill, Integer> {
		
	public Bill findByCustomer(User customer);
	
}
