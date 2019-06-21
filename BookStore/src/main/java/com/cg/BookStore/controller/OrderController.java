package com.cg.BookStore.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.BookStore.beans.Book;
import com.cg.BookStore.beans.Category;
import com.cg.BookStore.beans.Customer;
import com.cg.BookStore.beans.Order;
import com.cg.BookStore.beans.Review;
import com.cg.BookStore.exceptions.BookNotFoundException;
import com.cg.BookStore.services.BookService;
import com.cg.BookStore.services.CustomerServices;
import com.cg.BookStore.services.OrderServices;

@RestController
public class OrderController {
	@Autowired
	OrderServices orderServices;
	@Autowired
	BookService bookServices;
	@Autowired
	CustomerServices custServices;
	@RequestMapping(value="/placeOrder",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> makeOrder(@RequestBody  Order order) throws BookNotFoundException{
		Customer customer=custServices.getDetailsById(1);
		List<Book>bookList = new ArrayList<>(); 

		bookList.add(new Book(new Category(), "chaman", "chaman", "fffwef", 12334, "wdfwfwf", 677.6f, "535gfd", 4,new ArrayList<Review>()));
		order.setBooks(bookList);
		order.setOrderDate(LocalDate.now());
		order.setCustomer(customer);
		orderServices.createOrder(order);
		return new ResponseEntity<>("Order done", HttpStatus.OK);

	}
	@RequestMapping(value="/deleteOrder",method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String> deleteOrder(@RequestParam Integer orderId ){
		orderServices.deleteOrder(orderId);
		return new ResponseEntity<>("Order "+orderId+" deleted Successfully!!!", HttpStatus.OK);

	}

}
