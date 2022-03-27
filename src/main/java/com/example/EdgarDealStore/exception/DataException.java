package com.example.EdgarDealStore.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)  // 404
public class DataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3660373354501882629L;

	public DataException(String msg) {
		super(msg);
	}
}
