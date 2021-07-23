package com.krishna;

//subclass overridden method can throw same or child type exceptions

public class Example14 extends Example10{
	
	public void method2() throws RuntimeException,ClassCastException,NullPointerException {
		System.out.println("method2 from super..");
	}

	

}
