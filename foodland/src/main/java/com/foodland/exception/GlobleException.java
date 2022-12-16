package com.foodland.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobleException {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<MyErrorDetails> userExceptionHandler(UserException u, WebRequest req){

        MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),u.getMessage(),req.getDescription(false));

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.OK);

    }

    @ExceptionHandler(UserLoginException.class)
    public ResponseEntity<MyErrorDetails> userLoginExceptionHandler(UserLoginException u, WebRequest req){

        MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),u.getMessage(),req.getDescription(false));

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.OK);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> genralExceptionHandler(Exception u, WebRequest req){

        MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),u.getMessage(),req.getDescription(false));

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.OK);

    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<MyErrorDetails> noExceptionHandler(NoHandlerFoundException u, WebRequest req){

        MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),u.getMessage(),req.getDescription(false));

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.OK);

    }



}
