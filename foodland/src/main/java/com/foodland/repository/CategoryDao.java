package com.foodland.repository;

import com.foodland.exception.CategoryException;
import com.foodland.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {


}
