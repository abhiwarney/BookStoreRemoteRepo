package com.cg.BookStore.services;

import java.util.List;

import com.cg.BookStore.beans.Book;
import com.cg.BookStore.exceptions.BookNotFoundException;

public interface IBookService {
	public Book registerBook(Book book);
	public boolean deleteBook(Integer bookId);
	public Book updateBook(Book book);
	public List<Book> listAllBooks();
	public Book getBookDetails(Integer bookId)throws BookNotFoundException;
}
