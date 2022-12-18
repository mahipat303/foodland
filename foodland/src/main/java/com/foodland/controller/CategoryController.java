package com.foodland.controller;


import com.foodland.exception.CategoryException;
import com.foodland.model.Category;
import com.foodland.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
	private CategoryService cs;

	@PostMapping("/category/{key}")
	public Category addCategory(Category category, String key) throws CategoryException, CategoryException {

		return cs.addCategory(category, key);
	}

	@PutMapping("/category/{key}")
	public Category updateCategory(@RequestBody Category category, String key) throws CategoryException {

		return cs.updateCategory(category, key);
	}

	@PutMapping("/removecategory/{key}")
	public Category removeCategory(@RequestBody Category category, String key) throws CategoryException {

		return cs.removeCategory(category, key);
	}

	@GetMapping("/category/{key}")
	public Category viewCategory(@RequestBody Category category, String key) throws CategoryException {

		return cs.viewCategory(category, key);
	}

	@GetMapping("/categories/{key}")
	public List<Category> viewAllCategory(String key) throws CategoryException {

		return cs.viewAllCategory(key);
	}

}
