package com.krishna;

public class Example11 extends Thread {
	
	public void run() {
		
		for(int i=0;i<50;i++) {
			yield();
		System.out.println(Thread.currentThread().getName() +" is accessing");
		}
		
	}

	public static void main(String[] args) {
		
		Example11 e11=new Example11();
		e11.setPriority(3);
		  e11.start();
		  
		for(int i=0;i<50;i++) {
		
			System.out.println(Thread.currentThread().getName()+" is accessing..");
		}

	}

}
