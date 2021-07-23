package com.krishna;

public class Example2 extends EXample1 {

	public void raiseClassCastException(EXample1 e) {
		Example2 e1=(Example2) e;
	}
	
	public void raiseNullPointerException() {
		String name=null;
		name.indexOf(0);
	}
	
	public void handleClassCastException(EXample1 e) {
		
		if(e instanceof Example2) {
			Example2 e1=(Example2)e;
		}else {
			System.out.println("It may Raise ClassCastException");
		}
		
	}
	
	public void handleNullpointerException() {
		String name=null;
		if(name !=null) {
			name.indexOf(0);
		}else {
			System.out.println("we can't call method on null");
		}
		
	}
	public static void main(String[] args) {
		Example2 e2=new Example2();
		
		//e2.checkClassCastException(new EXample1());
		//e2.raiseNullPointerException();
		e2.handleClassCastException(new EXample1());
		//e2.handleNullpointerException();
		//e2.raiseClassCastException(new EXample1());
		
	}

}
