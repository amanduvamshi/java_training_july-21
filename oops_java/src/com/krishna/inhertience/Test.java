package com.krishna.inhertience;

// we can't extend two classes, reason ambiguity.
//public class Test extends User , User1{ 

public class Test extends User{
	
	
	  void run() { System.out.println("sub class run...."); }
	 
	public static void main(String[] args) {
		
		User t=new Test();
		t.start();
		
	}

}
