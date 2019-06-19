package com.cg.BookStore.services;

import java.util.List;

import com.cg.BookStore.beans.Admin;
import com.cg.BookStore.beans.Book;
import com.cg.BookStore.beans.Category;
import com.cg.BookStore.beans.Customer;
import com.cg.BookStore.beans.Order;
import com.cg.BookStore.beans.Review;
import com.cg.BookStore.exceptions.CategoryNotFoundException;

public interface IAdminService {
	/*----------------Admin-User Services-----------------------*/
	public Admin createAdminUser(String emailId, String fullName, String password);
	public boolean editAdminUser(Admin admin);
	public boolean deleteAdminUser(Integer adminId);
	public List<Admin> listAllAdminUser();
	
	/*-----------------Admin-Customer Services----------------*/
	public Customer createCustomer(String fullName, String emailId, String password, String phoneNumber, String country, String city, String street, Integer zipCode);
	public boolean deleteCustomer(Integer customerId);
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
	
	/*-------------------------Admin-Category Services------------------------------*/
	public Category createCategory(Category category);
	public boolean deleteCategory(Integer categoryId);
	public boolean updateCategory(Integer categoryId)throws CategoryNotFoundException;
	public Category getCategoryDetails(Integer categoryId)throws CategoryNotFoundException;
	public List<Category> listAllCategories();
	
	/*-------------------------Admin-Review Services------------------------------*/
	public boolean deleteReview(Integer reviewId);
	public boolean updateReview(Review review);
	public List<Review> listAllReview();
	
}
