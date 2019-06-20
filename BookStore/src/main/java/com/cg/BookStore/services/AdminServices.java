package com.cg.BookStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.BookStore.beans.Admin;
import com.cg.BookStore.beans.Book;
import com.cg.BookStore.beans.Category;
import com.cg.BookStore.beans.Customer;
import com.cg.BookStore.beans.Order;
import com.cg.BookStore.beans.Review;
import com.cg.BookStore.daoservices.AdminDao;
import com.cg.BookStore.daoservices.CategoryDao;
import com.cg.BookStore.daoservices.CustomerDao;
import com.cg.BookStore.exceptions.CategoryNotFoundException;

@Component("adminServices")
public class AdminServices implements IAdminService{

	@Autowired
	AdminDao adminDao;
	@Autowired
	CustomerDao customerDao;
	@Autowired
	CustomerServices customerServices;
	@Autowired
	BookService bookService;
	@Autowired
	OrderServices orderServices;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	ReviewServices reviewServices;

	@Override
	public Admin createAdminUser(String emailId, String fullName, String password) {
		Admin admin= new Admin(emailId, fullName, password);
		return adminDao.save(admin);
	}

	@Override
	public boolean editAdminUser(Admin admin) {
		adminDao.save(admin);
		return true;
	}

	@Override
	public boolean deleteAdminUser(Integer adminId) {
		adminDao.deleteById(adminId);
		return true;
	}

	@Override
	public List<Admin> listAllAdminUser() {
		return adminDao.findAll();
	}

	@Override
	public Customer createCustomer(String fullName, String emailId, String password, String phoneNumber, String country,
			String city, String street, Integer zipCode) {
		return customerServices.registerCustomer(fullName, emailId, password, phoneNumber, country, city, street, zipCode);
	}

	@Override
	public boolean deleteCustomer(Integer customerId) {
		customerDao.deleteById(customerId);
		return true;
	}

	@Override
	public boolean editCustomer(Customer customer) {

		return false;
	}

	@Override
	public List<Customer> listAllCustomer() {
		return customerDao.findAll();
	}


	@Override
	public boolean updateOrder(Order order) {
		orderServices.createOrder(order);
		return false;
	}

	@Override
	public boolean deleteOrder(Integer orderId) {
		orderServices.deleteOrder(orderId);
		return false;
	}

	@Override
	public Order viewOrderDetails(Integer orderId) {
		return orderServices.getOrderDetails(orderId);
	}

	@Override
	public List<Order> listAllOrders() {
		return orderServices.listAllOrders();
	}

	@Override
	public Category createCategory(Category category) {
		return categoryDao.save(category);
	}

	@Override
	public boolean deleteCategory(Integer categoryId) {
		categoryDao.deleteById(categoryId);
		return false;
	}

	@Override
	public Category getCategoryDetails(Integer categoryId) {
		return categoryDao.findById(categoryId).orElseThrow(()->new CategoryNotFoundException("Invalid Category Id!!"));
	}

	@Override
	public boolean updateCategory(Integer categoryId)throws CategoryNotFoundException {
		Category category = getCategoryDetails(categoryId);
		categoryDao.save(category);
		return false;
	}

	@Override
	public List<Category> listAllCategories() {
		return categoryDao.findAll();
	}

	@Override
	public boolean deleteReview(Integer reviewId) {
		reviewServices.deleteReview(reviewId);
		return true;
	}

	@Override
	public boolean updateReview(Review review) {
		reviewServices.updateReview(review);
		return false;
	}

	@Override
	public List<Review> listAllReview() {
		return reviewServices.listAllReviews();
	}



}
