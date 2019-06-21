package com.cg.BookStore.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.BookStore.exceptions.BookAlreadyExistException;
import com.cg.BookStore.response.CustomResponse;

@ControllerAdvice
public class BookStoreExceptionAspect {
	//Function to handle product not found exception
	@ExceptionHandler(BookAlreadyExistException.class)
	public ResponseEntity<CustomResponse> handleProductNotFoundException(Exception e) {
		CustomResponse response=new CustomResponse(e.getMessage(), HttpStatus.EXPECTATION_FAILED.value());
		return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
	}
}
