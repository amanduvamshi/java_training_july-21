package com.krishna;

public class User2 extends User {

	
	public void m7() {
		System.out.println("m7");
		this.m9();
	}
	
	public void m9() {
		System.out.println("...m9");
	}
	
	public static void main(String[] args) {
		
		User user  = new User2();
		user.m1();
	}
}
