package com.foodland.service;

import com.foodland.exception.CategoryException;
import com.foodland.model.Category;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

	public Category addCategory(Category category,String key) throws CategoryException;
	public  Category updateCategory(Category category,String key) throws CategoryException;
	public Category removeCategory(Category category,String key) throws CategoryException;
	public Category viewCategory(Category category,String key) throws CategoryException;
	public List<Category> viewAllCategory(String key) throws CategoryException;
}
