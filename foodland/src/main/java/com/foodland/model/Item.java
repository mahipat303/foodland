package com.foodland.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="Cid")
//	private Category category;
	
	private Integer cost;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="restaurantaid")
	private Restaurant restaurant;
	
	private Integer Quantity;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private FoodCart cart;
	
	
}
