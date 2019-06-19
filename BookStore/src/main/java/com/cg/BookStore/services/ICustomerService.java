package com.cg.BookStore.services;
import com.cg.BookStore.beans.Customer;
public interface ICustomerService {
public Customer registerCustomer(String fullName, String emailId, String password, String phoneNumber, String country, String city, String street, Integer zipCode);
public Customer login(String emailId, String password);
public Customer getCustomerDetails(String emailId);
}
