package com.cg.BookStore.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.BookStore.beans.Address;
import com.cg.BookStore.beans.Customer;
import com.cg.BookStore.daoservices.CustomerDao;
import com.cg.BookStore.exceptions.CustomerNotFoundException;
import com.cg.BookStore.exceptions.InvalidUsernameOrPasswordException;
@Component("customerService")
public class CustomerServices implements ICustomerService{
	@Autowired
CustomerDao customerDao;
	@Override
	public Customer registerCustomer(String fullName, String emailId, String password, String phoneNumber,
			String country, String city, String street, Integer zipCode) {
		Customer customer=new Customer(fullName, emailId, password, phoneNumber, new Address(country, city, street, zipCode));
		customer.setDate(LocalDate.now());
		return customerDao.save(customer);
	}

	@Override
	public Customer login(String emailId, String password) {
		Customer customer=getCustomerDetails(emailId);
		if(customer.getPassword().equals(password)) 
			return customer;
		else
			throw new InvalidUsernameOrPasswordException();
	}

	@Override
	public Customer getCustomerDetails(String emailId) {
		return customerDao.getCustDetails(emailId);
	}
	

}
