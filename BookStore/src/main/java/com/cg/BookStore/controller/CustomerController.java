package com.cg.BookStore.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.BookStore.services.CustomerServices;
@RestController
public class CustomerController {
	@Autowired
	CustomerServices customerServices;
    @RequestMapping(value="/acceptDetails", method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String> acceptCustomerDetails(String fullName, String emailId, String password, String phoneNumber,
			String country, String city, String street, int zipCode){
		customerServices.registerCustomer(fullName, emailId, password, phoneNumber, country, city, street, zipCode);
		return new ResponseEntity<>("Customer Registered",HttpStatus.OK);
		
	}
}
