package com.foodland.model;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String mobile;
	private String email;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AID")
	private Address address;
	
	
	public User(Integer userId, String firstName, String lastName, Integer age, String gender, String mobile,
			String email, Address address) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	
	
public User() {
	// TODO Auto-generated constructor stub
}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobile;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobile = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	

}
