package com.foodland.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodland.model.OrderDetail;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer> {

}
