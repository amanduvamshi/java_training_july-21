package com.krishna;

/*We can't increase the scope of exception in sub class.
Here super class throwing Runtime EXception but from sub we are throwing Exception*/

public class Example13 extends Example10 {

	
	public void method2() throws Exception {
		System.out.println("method2 from super..");
	}

}
