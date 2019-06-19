package com.cg.BookStore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.BookStore.beans.Customer;
 public interface CustomerDao extends JpaRepository<Customer, Integer> {
	@Query("from Customer where email_id=:emailId")
	public Customer getCustDetails(String emailId);
 }

