package com.foodland.service;

import com.foodland.dto.LoginDTO;
import com.foodland.exception.UserLoginException;

public interface LoginService {

    public String logIntoCustomer(LoginDTO dto) throws UserLoginException;

    public String logIntoRestaurent(LoginDTO dto) throws UserLoginException;

    public String logOutFromSession(String key) throws UserLoginException;



}
