package com.cg.BookStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.BookStore.beans.Book;
import com.cg.BookStore.daoservices.BookDao;
@Component("bookService")
public class BookService implements IBookService {
	@Autowired
	BookDao bookDao;
	@Override
	public String registerBook(Book book) {
		bookDao.save(book);
		return null;
	}

	@Override
	public boolean deleteBook() {
		// TODO Auto-generated method stub
		return false;
	}

}
