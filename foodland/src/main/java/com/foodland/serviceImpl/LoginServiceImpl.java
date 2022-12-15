package com.foodland.serviceImpl;

import com.foodland.dto.LoginDTO;
import com.foodland.exception.UserException;
import com.foodland.exception.UserLoginException;
import com.foodland.model.CurrentUserSession;
import com.foodland.model.Restaurant;
import com.foodland.model.User;
import com.foodland.repository.RestaurantDao;
import com.foodland.repository.SessionDao;
import com.foodland.repository.UserDao;
import com.foodland.service.LoginService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao udao;
    @Autowired
    private SessionDao sdao;
   @Autowired
   private RestaurantDao rdao;



    @Override
    public String logIntoCustomer(LoginDTO dto) throws UserLoginException {
        User existingUser = udao.findByMobile(dto.getMobile());

        if(existingUser == null){
            throw  new UserLoginException("User not exist with this mobile no. plz create Account");
        }

        Optional<CurrentUserSession> validSession = Optional.ofNullable(sdao.findByMobile(existingUser.getMobile()));

        if(validSession.isPresent()){
            throw new UserLoginException("User already logged in with this Number");


        }

        if(existingUser.getPassword().equals(dto.getPassword())){

            String key = RandomString.make(8);

            CurrentUserSession currentUserSession = new CurrentUserSession(existingUser.getMobile(),key,
                    LocalDateTime.now(),existingUser.getType());

            sdao.save(currentUserSession);

            return currentUserSession.toString();
        }else {

            throw new UserLoginException("Please enter valid password");
        }


    }

    @Override
    public String logIntoRestaurent(LoginDTO dto) throws UserLoginException {

        Restaurant existingUser = rdao.findByMobile(dto.getMobile());
        if(existingUser == null){
            throw  new UserLoginException("User not exist with this mobile no. plz create Account");
       }

       Optional<CurrentUserSession> validSession = Optional.ofNullable(sdao.findByMobile(existingUser.getMobile()));

       if(validSession.isPresent()){
           throw new UserLoginException("User already logged in with this Number");


        }

        if(existingUser.getPassword().equals(dto.getPassword())){

            String key = RandomString.make(8);



            CurrentUserSession currentUserSession = new CurrentUserSession(existingUser.getMobile(),key,

                    LocalDateTime.now(),existingUser.getType());



            sdao.save(currentUserSession);



            return currentUserSession.toString();

        }else {



            throw new UserLoginException("Please enter valid password");

        }

    }

    @Override
    public String logOutFromSession(String key) throws UserLoginException {

        CurrentUserSession currentUserSession = sdao.findByUuid(key);

        if(currentUserSession == null){
             throw new UserLoginException("User Not logged in with this Number");
        }

        sdao.delete(currentUserSession);

        return "Logged out";
    }


}
