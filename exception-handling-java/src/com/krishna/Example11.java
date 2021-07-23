package com.krishna;

/*If super class exception is not throwing and 
sub class overridden method is throwing checked exception*/
public class Example11 extends Example10 {
	
	public void method1() throws ClassNotFoundException {
		Class.forName("com.krishn.A");
		System.out.println("method from sub class...");
	}

	public static void main(String[] args) {
		

	}

}
