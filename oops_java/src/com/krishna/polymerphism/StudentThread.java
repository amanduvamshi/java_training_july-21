package com.krishna.polymerphism;

public class StudentThread extends Thread {

	
	public void run() {
		System.out.println("... run ...");
	}
	
	public static void main(String[] args) {
		//Runnable t1=new StudentThread();
		StudentThread t=new StudentThread();
		t.start();
	}
}
