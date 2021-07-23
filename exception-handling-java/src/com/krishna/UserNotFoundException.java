package com.krishna;


/*
 * Write a class extends Exception implement construtor pass message to super
 * classs construtor.
 */

public class UserNotFoundException extends Exception {
	
	public UserNotFoundException(String s) {
		super(s);
	}

}

