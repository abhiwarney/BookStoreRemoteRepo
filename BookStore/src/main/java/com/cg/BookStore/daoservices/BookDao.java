package com.cg.BookStore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.BookStore.beans.Book;

public interface BookDao extends JpaRepository<Book,Integer> {

}
