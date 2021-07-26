package com.krishna;

public class Example3 extends Thread{
	
	String name;
	
	public Example3(String n) {
		name=n;
	}
	
	public void run() {
		for(int i=0;i<10;i++)
			synchronized (name) {
				System.out.println("run..."+name);
			}
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		Example3 e3=new Example3("krishna");
		Example3 e4=new Example3("Ramu");
		
		/*
		 * e3.start(); e3.join(); e4.start();
		 */
		e4.start();
		e4.join(); 
		e3.start(); 	
		}

}
