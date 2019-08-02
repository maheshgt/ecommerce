package com.ecommerse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ecommerse.entity.Products;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ItemNotFoundException.class)
	  public final ResponseEntity<Products> handleUserNotFoundException(ItemNotFoundException ex, WebRequest request) {
	        request.getDescription(false);
	        Products products = new Products();
	    return new ResponseEntity<>(products, HttpStatus.NOT_FOUND);
}
}
