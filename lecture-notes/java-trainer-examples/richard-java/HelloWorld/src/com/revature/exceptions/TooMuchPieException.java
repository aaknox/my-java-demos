package com.revature.exceptions;

public class TooMuchPieException extends Exception{

	public TooMuchPieException() {
		super("Object ate too much pie.");
	}
	
	public TooMuchPieException(String message) {
		super(message);
	}
}
