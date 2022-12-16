package com.foodland.controller;


import com.foodland.dto.LoginDTO;
import com.foodland.model.User;
import com.foodland.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/loginCustomer")
    public ResponseEntity<String > LogIntoCustomerHandler(@RequestBody LoginDTO dto){

        String message = loginService.logIntoCustomer(dto);

        return new ResponseEntity<String>(message, HttpStatus.OK);

    }


    @GetMapping("/loginRestaurent")
    public ResponseEntity<String > LogIntoRestaurentHandler(@RequestBody LoginDTO dto){

        String message = loginService.logIntoRestaurent(dto);

        return new ResponseEntity<String>(message, HttpStatus.OK);

    }

    @DeleteMapping("/logoutUser/{key}")
    public ResponseEntity<String > LogOutHandler(@PathVariable("key") String  key){

        String message = loginService.logOutFromSession(key);

        return new ResponseEntity<String>(message, HttpStatus.OK);

    }

}
