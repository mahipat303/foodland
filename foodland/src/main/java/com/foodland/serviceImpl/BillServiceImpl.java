package com.foodland.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodland.exception.BillException;
import com.foodland.exception.FoodCartException;
import com.foodland.exception.UserException;
import com.foodland.model.Bill;
import com.foodland.model.CurrentUserSession;
import com.foodland.model.FoodCart;
import com.foodland.model.User;
import com.foodland.model.UserType;
import com.foodland.repository.BillDao;
import com.foodland.repository.FoodCartDao;
import com.foodland.repository.ItemDao;
import com.foodland.repository.SessionDao;
import com.foodland.repository.UserDao;
import com.foodland.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private FoodCartDao fdo;

	@Autowired
	private ItemDao ido;

	@Autowired
	private SessionDao sdo;

	@Autowired
	private UserDao udo;

	@Autowired
	private BillDao bdo;

	@Override
	public Bill viewBill(String key) throws BillException, UserException {

		CurrentUserSession cus = sdo.findByUuid(key);

		UserType uType = cus.getType();

		if (uType.name() == "Customer") {

			User user = udo.findByMobile(cus.getMobile());

			Bill bill = bdo.findByCustomer(user);

			if (bill == null) {
				throw new BillException("no bill available for this customer");
			}

			return bill;

		} else {
			throw new UserException("login as a customer");
		}

	}

}
