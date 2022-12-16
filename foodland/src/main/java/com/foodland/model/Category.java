package com.foodland.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CategoryId;

	private String CategoryName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Item> items=new ArrayList<Item>();

}
