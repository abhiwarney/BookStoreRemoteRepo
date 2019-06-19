package com.cg.BookStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.BookStore.beans.Order;
import com.cg.BookStore.daoservices.OrderDao;
import com.cg.BookStore.exceptions.OrderNotFoundException;
@Component("orderServices")
public class OrderServices implements IOrderService{

	@Autowired
	OrderDao orderDao;
	@Override
	public Order createOrder(Order order) {
		return orderDao.save(order);
	}

	@Override
	public boolean deleteOrder(Integer orderId) {
		orderDao.deleteById(orderId);
		return false;
	}

	@Override
	public boolean updateOrder(Order order) {
		orderDao.save(order);
		return false;
	}

	@Override
	public List<Order> listAllOrders() {
		return orderDao.findAll();
	}

	@Override
	public Order getOrderDetails(Integer orderId) {
		Order order = orderDao.findById(orderId).orElseThrow(()->new OrderNotFoundException("Invalid Order ID!!"));
		return order;
	}

}
