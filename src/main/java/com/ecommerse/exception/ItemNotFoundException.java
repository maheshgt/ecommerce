package com.ecommerse.exception;

public class ItemNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;

	public ItemNotFoundException(String exception) {
		
		super(exception);
	}
	

}
