package com.cg.BookStore.services;

import java.util.List;

import com.cg.BookStore.beans.Book;

public interface IBookService {
	public String registerBook(Book book);
	public boolean deleteBook(Integer bookId);
	public Book updateBook(Book book);
	public List<Book> listAllBooks();
	
}
