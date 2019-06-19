package com.cg.BookStore.controller;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.OneToMany;

import org.hibernate.type.descriptor.java.LocalDateJavaDescriptor;
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
import com.cg.BookStore.beans.Customer;
import com.cg.BookStore.beans.Order;
import com.cg.BookStore.services.CustomerServices;
import com.cg.BookStore.services.OrderServices;

@RestController
public class OrderController {
	@Autowired
 OrderServices orderServices;
	@Autowired
	CustomerServices custServices;
@RequestMapping(value="/placeOrder",method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<String> makeOrder(@RequestBody String recipientName, Long recipientNumber,String streetAddress, String city, String country,Integer zipcode,List<Book> books,
		Integer quantity, Float subtotal, Float total, String orderStatus,String paymentMethod, Integer custId ){
	Customer customer=custServices.getDetailsById(custId);
	Order order=new Order(recipientName, recipientNumber, streetAddress, city, country, zipcode, books, quantity, subtotal, total, orderStatus,
			paymentMethod, LocalDate.now(), customer);
	orderServices.createOrder(order);
	return new ResponseEntity<>("Order done", HttpStatus.OK);
	
}

}
