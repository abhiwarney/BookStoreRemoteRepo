package com.cg.BookStore.services;

import java.util.List;

import com.cg.BookStore.beans.Admin;
import com.cg.BookStore.beans.Book;
import com.cg.BookStore.beans.Customer;
import com.cg.BookStore.beans.Order;

public interface IAdminService {
	/*----------------Admin-User Services-----------------------*/
	public Admin createAdminUser(String emailId, String fullName, String password);
	public boolean editAdminUser(Admin admin);
	public boolean deleteAdminUser(Integer adminId);
	public List<Admin> listAllAdminUser();
	
	/*-----------------Admin-Customer Services----------------*/
	public Customer createCustomer(String fullName, String emailId, String password, String phoneNumber, String country, String city, String street, Integer zipCode);
	public boolean deleteCustomer(Customer customer);
	public boolean editCustomer(Customer customer);
	public List<Customer> listAllCustomer();
	
	/*-------------------------Admin-Book Services------------------------------*/
	public List<Book> listAllBooks();
	public String createBook(Book book);
	public boolean deleteBook(Integer bookId);
	public boolean updateBook(Book book);
	
	/*-------------------------Admin-Order Services------------------------------*/
	public boolean updateOrder(Order order);
	public boolean deleteOrder(Integer orderId);
	public Order viewOrderDetails(Integer orderId);
	public List<Order> listAllOrders();
	
	/*-------------------------Admin-Review Services------------------------------*/
	public List<E>
}
