package com.skanda_practice.skanda.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(CustomerNotFountException.class)
	public ResponseEntity<String> handleCustomerNotFound(CustomerNotFountException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGeneral(Exception ex){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Worng" + ex.getMessage());
	}

}
