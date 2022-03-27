package com.example.EdgarDealStore.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="File related problem")  // 404
public class FileException extends RuntimeException {
    
	public FileException(String msg) {
    	super(msg);
    }
	
}