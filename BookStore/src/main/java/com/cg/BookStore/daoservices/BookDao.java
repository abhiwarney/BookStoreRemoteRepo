package com.cg.BookStore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.BookStore.beans.Book;
import com.cg.BookStore.beans.Customer;

public interface BookDao extends JpaRepository<Book,Integer> {
}
