package com.foodland.serviceImpl;

import com.foodland.exception.CategoryException;
import com.foodland.exception.RestaurantException;
import com.foodland.exception.UserException;
import com.foodland.model.Category;
import com.foodland.model.CurrentUserSession;
import com.foodland.model.Restaurant;
import com.foodland.model.UserType;
import com.foodland.repository.CategoryDao;
import com.foodland.repository.SessionDao;
import com.foodland.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryServiseImpl implements CategoryService{
	
	@Autowired
	private SessionDao sdo;
	
	@Autowired
	private CategoryDao cdo;
	
	@Override	
	public Category addCategory(Category category, String key) throws CategoryException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Restaurant")) {
             if(category!=null){
				 return cdo.save(category);
			 }else{
				 throw  new CategoryException("Please Enter Valid Category");
			 }


		} else {
			throw new UserException("Please login as a Restaurant");
		}
	}

	@Override
	public Category updateCategory(Category category, String key) throws CategoryException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Restaurant")) {
              Optional<Category> ocategory =cdo.findById(category.getCategoryId());
			  if(ocategory.isPresent()) {
				  cdo.delete(category);
				  return ocategory.get();
			  }else{
				  throw  new CategoryException("No category Found");
			  }


		} else {
			throw new UserException("Please login as a Restaurant");
		}
	}

	@Override
	public Category removeCategory(Category category, String key) throws CategoryException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Restaurant")) {
        Optional<Category> ocategory= cdo.findById(category.getCategoryId());

			if(ocategory.isPresent()){
				cdo.delete(category);
				return ocategory.get();
			}else{
				throw new CategoryException("No Category available like :" +category);
			}
		} else {
			throw new UserException("Please login as a Restaurant");
		}
	}

	@Override
	public Category viewCategory(Category category, String key) throws CategoryException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Customer") || uType.name().equals("Restaurant")) {

         Optional<Category> ct=cdo.findById(category.getCategoryId());
		 if(ct.isPresent()) {
			 return ct.get();
		 }else{
			 throw  new CategoryException("No Category found");
		 }

		} else {
			throw new UserException("Please Log in first");
		}
	}

	@Override
	public List<Category> viewAllCategory(String key) throws CategoryException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Customer") || uType.name().equals("Restaurant")) {

			List<Category> clist=cdo.findAll();
			if(clist.size()==0) {
				return clist;
			}else{
				throw  new CategoryException("No Category found");
			}

		} else {
			throw new UserException("Please Log in first");
		}
	}
}
