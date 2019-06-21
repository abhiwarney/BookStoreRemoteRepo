package com.cg.BookStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.BookStore.beans.Book;
import com.cg.BookStore.daoservices.BookDao;
import com.cg.BookStore.exceptions.BookNotFoundException;
@Component("bookService")
public class BookService implements IBookService {
	@Autowired
	BookDao bookDao;
	
	@Override
	public Book registerBook(Book book) {
		
		return bookDao.save(book);
		
	}

	@Override
	public boolean deleteBook(Integer bookId) {
		bookDao.deleteById(bookId);
		return false;
	}

	@Override
	public Book updateBook(Book book) {
		return bookDao.save(book);
	}

	@Override
	public List<Book> listAllBooks() {
		return bookDao.findAll();
	}

	@Override
	public Book getBookDetails(Integer bookId) throws BookNotFoundException {
		return bookDao.findById(bookId).orElseThrow(()->new  BookNotFoundException("Invalid Book Id!"));
	}

}
