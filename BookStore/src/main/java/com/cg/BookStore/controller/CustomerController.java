package com.cg.BookStore.controller;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.BookStore.beans.Customer;
import com.cg.BookStore.services.CustomerServices;
@RestController
public class CustomerController {
	@Autowired
	CustomerServices customerServices;
    @RequestMapping(value="/acceptDetails", method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String> acceptCustomerDetails(@RequestParam String fullName, String emailId, String password, String phoneNumber,
			String country, String city, String street, int zipCode){
		customerServices.registerCustomer(fullName, emailId, password, phoneNumber, country, city, street, zipCode);
		return new ResponseEntity<>("Customer Registered",HttpStatus.OK);
		
	}
    @RequestMapping(value="/login", method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE,  headers="Accept=application/json")
	public ResponseEntity<Customer> loginDetails(@RequestParam String emailId, String password){
		return new ResponseEntity<>(customerServices.login(emailId, password),HttpStatus.OK);
		
	}
    
    
}
