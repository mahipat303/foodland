package com.foodland.model;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity

public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private LocalDateTime time;

	private Integer totalitems;

	private Double totalCost;

	@ManyToOne
	@JoinColumn(name = "cusId")
	private User customer;

	public Bill() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Integer getTotalitems() {
		return totalitems;
	}

	public void setTotalitems(Integer totalitems) {
		this.totalitems = totalitems;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Bill(Integer id, LocalDateTime time, Integer totalitems, Double totalCost, User customer) {
		super();
		this.id = id;
		this.time = time;
		this.totalitems = totalitems;
		this.totalCost = totalCost;
		this.customer = customer;
	}

}
