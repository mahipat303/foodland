package com.foodland.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity

public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String houseNo;
	private String streetNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	public Address(String houseNo, String strretNo, String area, String city, String state, String country,
			String pincode) {
		super();
		this.houseNo = houseNo;
		this.streetNo = strretNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}



	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
}
