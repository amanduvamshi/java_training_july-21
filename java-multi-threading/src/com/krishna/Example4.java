package com.krishna;

public class Example4 implements Runnable {
	
	public void run() {
		
		System.out.println(Thread.currentThread());
		
		System.out.println("run..");
	}

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
	
		
		Thread t=new Thread(new Example4());
		
		t.start();
		

	}

}
