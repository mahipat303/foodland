package com.foodland.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer restaurantaid;
//	@AssertTrue
	private String restaurantName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Aid")
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "AID")
	private Address address;
	@OneToMany(mappedBy = "restaurant" ,cascade = CascadeType.DETACH)
	@JsonIgnore
	private List<Item> items;
//	@AssertTrue
	private String ManagerName;
//	@AssertTrue
	@Size(min = 10, max = 10)
	private String mobile;
	private String password;
	private UserType type;

	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.DETACH)
	@JsonIgnore
	private List<OrderDetail> orderDetails = new ArrayList<>();

	@OneToMany(cascade = CascadeType.DETACH)
	@JoinColumn(name = "resId")
	@JsonIgnore
	private List<Category> categories = new ArrayList<>();

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Restaurant() {
	}


	public Restaurant(Integer restaurantaid, String restaurantName, Address addresss, List<Item> items,
			String managerName, String mobile, String password, UserType type) {

		this.restaurantaid = restaurantaid;
		this.restaurantName = restaurantName;
		this.address = address;
		this.items = items;
		ManagerName = managerName;
		this.mobile = mobile;
		this.password = password;
		this.type = type;
	}

	public Integer getRestaurantaid() {
		return restaurantaid;
	}

	public void setRestaurantaid(Integer restaurantaid) {
		this.restaurantaid = restaurantaid;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
}
