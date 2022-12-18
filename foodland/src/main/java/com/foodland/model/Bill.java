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
@Data
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

}
