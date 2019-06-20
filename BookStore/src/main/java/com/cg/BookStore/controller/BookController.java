package com.cg.BookStore.controller;

import java.sql.Date;
import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.BookStore.beans.Book;
import com.cg.BookStore.beans.Category;
import com.cg.BookStore.services.BookService;

@RestController
public class BookController {
	@Autowired
  BookService bookServices;
	@RequestMapping(value="/addBook", method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE )
	public ResponseEntity<String> addBook(@RequestParam String categoryName,String title, String author, 
			String description, Integer ISDNnumber, String thumbnailImage, Float price, 
			String publishDate,Integer quantity)
{
		bookServices.registerBook(new Book(new Category(categoryName), title, author, description, ISDNnumber, thumbnailImage, price, publishDate, quantity));
		return new ResponseEntity<String>("Book Added", HttpStatus.OK);
		
	}
}
