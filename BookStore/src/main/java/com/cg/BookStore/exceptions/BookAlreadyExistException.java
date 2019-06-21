package com.cg.BookStore.exceptions;

public class BookAlreadyExistException extends RuntimeException{

	public BookAlreadyExistException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BookAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BookAlreadyExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BookAlreadyExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
