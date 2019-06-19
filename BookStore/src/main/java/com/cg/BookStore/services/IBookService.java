package com.cg.BookStore.services;

import com.cg.BookStore.beans.Book;

public interface IBookService {
	public String registerBook(Book book);
	public boolean deleteBook();
	
}
