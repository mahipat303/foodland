package com.foodland.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodland.exception.ItemException;
import com.foodland.exception.OrderDetailException;
import com.foodland.exception.RestaurantException;
import com.foodland.model.CurrentUserSession;
import com.foodland.model.Item;
import com.foodland.model.OrderDetail;
import com.foodland.model.Restaurant;
import com.foodland.model.UserType;
import com.foodland.repository.ItemDao;
import com.foodland.repository.OrderDetailDao;
import com.foodland.repository.RestaurantDao;
import com.foodland.repository.SessionDao;
import com.foodland.repository.UserDao;
import com.foodland.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private UserDao udo;

	@Autowired
	private ItemDao ido;

	@Autowired
	private RestaurantDao rdo;

	@Autowired
	private SessionDao sdo;

	@Autowired
	private OrderDetailDao odo;

	@Override
	public Item addItem(Item item, String key) throws ItemException, RestaurantException {

		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name() == "Restaurant") {

			Restaurant res = rdo.findByMobile(cus.getMobile());

			List<Item> items = res.getItems();

			for (Item i : items) {

				if (i.getItemName() == item.getItemName()) {
					throw new ItemException("item already created");
				}

			}

			items.add(item);
			return ido.save(item);

		} else {
			throw new RestaurantException("login as a Restaurant");
		}

	}

	@Override
	public Item updateItem(Item item, String key) throws ItemException, RestaurantException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item viewItem(Integer id, String key) throws ItemException, RestaurantException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item removeItem(Integer id, String key) throws ItemException, RestaurantException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item viewAllItemBycategory(Integer id, String key) throws ItemException, RestaurantException {
		// TODO Auto-generated method stub
		return null;
	}

}
