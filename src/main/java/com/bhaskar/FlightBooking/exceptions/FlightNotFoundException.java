package com.bhaskar.FlightBooking.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class FlightNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public FlightNotFoundException(String message)
	{
		super(message);
	}
	
	public FlightNotFoundException(String message,Throwable t)
	{
		super(message,t);
	}
}
