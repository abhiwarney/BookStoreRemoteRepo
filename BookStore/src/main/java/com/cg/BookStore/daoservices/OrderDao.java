package com.cg.BookStore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.BookStore.beans.Order;

public interface OrderDao  extends JpaRepository<Order, Integer>{

}
