package com.foodland.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer restaurantaid;
	@AssertTrue
	private String restaurantName;
//	private Address addresss;
//	private List<ItemList> items;
	@AssertTrue
	private String ManagerName;
	@AssertTrue
	@Size(min=10,max=10)
	private String contactNumber;
	

}
