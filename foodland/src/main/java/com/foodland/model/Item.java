package com.foodland.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Item {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer itemId;
	private String itemName;

	private Integer cost;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="restaurantaid")
	private Restaurant restaurant;
	
	private Integer Quantity;

	public Item(Integer itemId, String itemName, Integer cost, Restaurant restaurant, Integer quantity) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.cost = cost;
		this.restaurant = restaurant;
		Quantity = quantity;
	}

	public Item() {
		super();
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	//	@ManyToOne(cascade = CascadeType.ALL)
//	private FoodCart cart;
	

	
	
}
