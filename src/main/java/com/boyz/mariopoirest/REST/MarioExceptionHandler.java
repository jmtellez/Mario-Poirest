package com.boyz.mariopoirest.REST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MarioExceptionHandler{

@ExceptionHandler
public  ResponseEntity<MarioErrorResponse> handleException(MarioNotFoundException exc){
    
    // create MarioErrorResponse
    MarioErrorResponse error = new MarioErrorResponse(  
                                    HttpStatus.NOT_FOUND.value(),
                                    exc.getMessage(),
                                    System.currentTimeMillis());

    // return ResponseEntity
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
}

@ExceptionHandler
public  ResponseEntity<MarioErrorResponse> handleException(Exception exc){
    
    // create MarioErrorResponse
    MarioErrorResponse error = new MarioErrorResponse(  
                                    HttpStatus.BAD_REQUEST.value(),
                                    exc.getMessage(),
                                    System.currentTimeMillis());

    // return ResponseEntity
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
}
    
}