package com.krishna;

public class Example2  implements Runnable{
	
	public void run() {
		System.out.println("....run...");
		for(int i=0;i<=10;i++) {
			System.out.println("i value from run...:"+i);
		}
	}

	public static void main(String[] args) {
		 
	Thread t=new Thread(new Example2());
	
		System.out.println("main...");
		for(int i=0;i<=10;i++) {
			System.out.println("i value from main...:"+i);
		}
		
		t.start();

	}

}
