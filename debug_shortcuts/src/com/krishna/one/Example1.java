package com.krishna.one;

import java.util.ArrayList;

public class Example1 {
	
	public void m1() {
		System.out.println("I'm in m1()....");
	}
	
	public void m2() {
		System.out.println(".....I'm in m2.....");
	}

	public static void main(String[] args) {
		Example1 e1=new Example1();
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		System.out.println(al);
		e1.m1();
		e1.m2();
		System.out.println("End...");

	}

}
