package com.krishna.one;

public class Example2 {
	
	public void m1() {
		int a=10;
		System.out.println("A value:"+a);
		System.out.println("....Entered into m1()....");
		m2();
		System.out.println("....End of m1().....");
		
	}

	public void m2() {
		System.out.println("...Entered into m2()....");
		m3();
		System.out.println(".....End of m2().....");
	}
	
	public void m3() {
		System.out.println("...Entered into m3().....");
		m4();
		System.out.println("...End of m4().....");
	}
	
	public void m4() {
		System.out.println("...Entered into m4()......");
		System.out.println("End of m4....");
	}
	public static void main(String[] args) {
		
		Example2 e=new Example2();
		 e.m1();

	}

}
