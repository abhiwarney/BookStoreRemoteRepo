package com.cg.BookStore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.BookStore.beans.Customer;

public interface CustomerDao extends JpaRepository<Customer, String> {
	
}
