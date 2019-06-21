package com.cg.BookStore.controller;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.BookStore.beans.Address;
import com.cg.BookStore.beans.Customer;
import com.cg.BookStore.services.AdminServices;
import com.cg.BookStore.services.CustomerServices;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerServices customerServices;
	@Autowired
	AdminServices adminServices;
	@RequestMapping(value="/acceptDetails", method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE, headers="Accept=application/json")
	public ResponseEntity<String> acceptCustomerDetails(@RequestParam String fullName, String emailId, String password, String phoneNumber,
			String country, String city, String street, int zipCode){
		customerServices.registerCustomer(fullName, emailId, password, phoneNumber, country, city, street, zipCode);
		return new ResponseEntity<>("Customer Registered",HttpStatus.OK);
	}
	@RequestMapping(value="/login", method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE,  headers="Accept=application/json")
	public ResponseEntity<Customer> loginDetails(@RequestParam String emailId, String password){
		return new ResponseEntity<>(customerServices.login(emailId, password),HttpStatus.OK);

	}
	@RequestMapping(value="/showAll", method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE,  headers="Accept=application/json")
	public ResponseEntity<List<Customer>> showAll(){
		return new ResponseEntity<>(customerServices.showAllCustomers(),HttpStatus.OK);

	}
	@RequestMapping(value="/deleteCustomer", method=RequestMethod.DELETE,  produces=MediaType.APPLICATION_JSON_VALUE,  headers="Accept=application/json")
	public ResponseEntity <String> deleteCustomerId(@RequestParam Integer customerId){
		adminServices.deleteCustomer(customerId);
		return new ResponseEntity<>("Customer Deleted",HttpStatus.OK);
	}
	@RequestMapping(value="/updateDetails", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Customer> updateCustomer( @RequestParam Integer id,String fullName, String emailId, String password, String phoneNumber,
			String country, String city, String street, int zipCode){
		return new ResponseEntity<Customer>(customerServices.updateCustomer(id, fullName, emailId, password, phoneNumber, country, city, street, zipCode),HttpStatus.OK);
	}
	 @RequestMapping(value= {"/customerUpdate/{customerId}"},method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
		public ResponseEntity<Customer> updateDetailsPathParam(@PathVariable(value="customerId")Integer customerId, @RequestBody Customer customer) {
			//customer=customerServices.updateCustomerDetails(customerId);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK); 
			}
}

