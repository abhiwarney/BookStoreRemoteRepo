package com.cg.BookStore.services;

import java.util.List;

import com.cg.BookStore.beans.Order;
import com.cg.BookStore.exceptions.OrderNotFoundException;

public interface IOrderService {
public Order createOrder(Order order);
public boolean deleteOrder(Integer orderId);
public boolean updateOrder(Order order);
public List<Order> listAllOrders();
public Order getOrderDetails(Integer orderId) throws OrderNotFoundException;
}
