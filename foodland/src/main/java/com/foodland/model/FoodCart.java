package com.foodland.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FoodCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;

//	@OneToOne
//	private Customer customer;

//	@OneToMany
//	private List<Item> itemList;

}
