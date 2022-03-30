package com.sample.employeemanagement.Exception;

public class UserNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -5277064767280108740L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
