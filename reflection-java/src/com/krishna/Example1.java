package com.krishna;

public class Example1 {
	
	public void m1() {
		System.out.println("I'm in m1....");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Object o= Class.forName("com.krishna.Example1").newInstance();
		
		if(o instanceof Example1) {
		    Example1 e1=(Example1)o;
		e1.m1();
		}	
		System.out.println(o);

	}

}
