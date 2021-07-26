package com.krishna;

public class Example6 extends Thread{

	public void run() {
		synchronized (this) {
			for(int i=0;i<=50;i++)
				if(i==50) {
					System.out.println("I'm Ramu");
					System.out.println("I'm from ayodya...");
				}
	         notify();	
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Example6 e6=new Example6();
		e6.start();
		synchronized (e6) {
			System.out.println("Hi my name is krishna");
			System.out.println("I'm from dwaraka..");
			e6.wait();
			System.out.println("Nice to meet you.");
			
		}
	}
}
