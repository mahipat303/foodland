package com.foodland.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	@Column(unique = true)
	private String mobile;
	private String email;
	private UserType type;
	private String password;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AID")
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_id")
//	@PrimaryKeyJoinColumn
	@JsonIgnore
	private FoodCart cart;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<OrderDetail> orderDetails = new ArrayList<>();
	

	public User() {
	}

	public User(Integer userId, String firstName, String lastName, Integer age, String gender, String mobile, String email, UserType type, String password, Address address) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.type = type;
		this.password = password;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", type=" + type +
				", password='" + password + '\'' +
				", address=" + address +
				'}';
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
