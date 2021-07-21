package com.krishna.polymerphism;

public class Example2 extends Example1 {

	
	public void m1() { System.out.println("m1 from sub"); }
	 

	public static void main(String[] args) {

		Example1 e1 = new Example2();
		e1.m1();

	}

}
