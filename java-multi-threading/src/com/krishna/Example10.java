package com.krishna;


//Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.

public class Example10  extends Thread{
	
	public void run() {
		
		synchronized (this) {
			System.out.println("Waiting for main thread execution...");
			try {
				//wait();
				notify();
			System.out.println("waiting time completed on Thread-0 thread...");
			} catch (Exception e) {
			System.out.println("error:"+e);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Example10 e10=new Example10();
		
		e10.start();
		
		synchronized (e10) {
			System.out.println("waiting for thread-0 execution..");
			e10.wait();
			System.out.println("waiting time completed on main thread...");
		}

	}

}
