package com.krishna;

/*If superclass is not throwing exception and subclass overridden method 
throwing RuntimeException no issue*/

public class Example12 extends Example10 {
	
	public void method1() throws ClassCastException,NullPointerException{
		System.out.println("method1 from sub...");
	}

}
