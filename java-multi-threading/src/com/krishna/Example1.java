package com.krishna;

public class Example1 extends Thread{
	
	public void run() {
		System.out.println("....run...");
		for(int i=0;i<=10;i++) {
			System.out.println("i value from run...:"+i);
		}
	}

	public static void main(String[] args) {
		 
		new Example1().start();
		System.out.println("main...");
		for(int i=0;i<=10;i++) {
			System.out.println("i value from main...:"+i);
		}

	}

}
