package com.foodland.serviceImpl;

import com.foodland.exception.OrderDetailException;
import com.foodland.exception.RestaurantException;
import com.foodland.exception.UserException;
import com.foodland.model.CurrentUserSession;
import com.foodland.model.OrderDetail;
import com.foodland.model.Restaurant;
import com.foodland.model.UserType;
import com.foodland.repository.RestaurantDao;
import com.foodland.repository.SessionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodland.service.RestaurentService;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurentService {

	@Autowired
	private RestaurantDao rdo;

	@Autowired
	private SessionDao sdo;

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) throws RestaurantException {
		return null;
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant, String key) throws RestaurantException {



		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Restaurant")) {

			if(restaurant==null){
				throw new RestaurantException("Please Enter Valid Restaurant");
			}else {
				return rdo.save(restaurant);

			}


		} else {
			throw new RestaurantException("login as a Restaurant");
		}

	}



	@Override
	public Restaurant removeRestaurant(Restaurant restaurant, String key) throws RestaurantException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Restaurant")) {

           if(restaurant==null){
			   throw  new RestaurantException("Please Enter Valid Restaurant");
		   }else{
			   Optional<Restaurant> existingRestaurant =rdo.findById(restaurant.getRestaurantaid());
			   if(existingRestaurant.isPresent()){
				   rdo.delete(existingRestaurant.get());
				   return existingRestaurant.get();
			   }else{
				   throw new RestaurantException("Restaurant Does not Exist");
			   }
		   }

		} else {
			throw new RestaurantException("login as a Restaurant");
		}

	}

	@Override
	public Restaurant viewRestaurant(Restaurant restaurant, String key) throws RestaurantException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Restaurant")) {

			if(restaurant==null){
				throw  new RestaurantException("Please Enter Valid Restaurant");
			}else{
				Optional<Restaurant> existingRestaurant =rdo.findById(restaurant.getRestaurantaid());
				if(existingRestaurant.isPresent()){
					return existingRestaurant.get();
				}else{
					throw new RestaurantException("Restaurant Does not Exist");
				}
			}
		} else {
			throw new RestaurantException("login as a Restaurant");
		}

	}

	@Override
	public List<Restaurant> viewRestaurantByLocation(String location, String key) throws RestaurantException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Customer")) {








		} else {
			throw new UserException("login as a Customer");
		}



		return null;
	}

	@Override
	public List<Restaurant> viewRestaurantsByItemName(String name, String key) throws RestaurantException {
		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name().equals("Customer")) {








		} else {
			throw new UserException("login as a Customer");
		}



		return null;
	}
}
