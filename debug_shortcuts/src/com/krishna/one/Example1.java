package com.krishna.one;

public class Example1 {
	
	public void m1() {
		System.out.println("I'm in m1()....");
	}
	
	public void m2() {
		System.out.println(".....I'm in m2.....");
	}

	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.m1();
		e1.m2();
		System.out.println("End...");

	}

}
