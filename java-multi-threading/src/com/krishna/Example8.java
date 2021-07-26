package com.krishna;


/*Threads communicate primarily by sharing access to fields and the objects reference fields refer to.
This form of communication is extremely efficient, but makes two kinds of errors possible: 
	thread interference and memory consistency errors.
The tool needed to prevent these errors is synchronization.*/

//Thread Interference
public class Example8 extends Thread{
	
	int balance=1000;
	
	public void run() {
		try {
			withdraw(20000);
		} catch (InterruptedException e) {
			
		}
	}
	
	public void withdraw(int amount) throws InterruptedException {
		
		if(balance> amount) {
			System.out.println("please collect cash.."+amount);
		}else {
			System.out.println("Insufficient funds.");
		}
	}
	
	public void deposit(int amount) throws InterruptedException {
		Thread.sleep(1000);
		balance=balance+amount;
		System.out.println("Amount creadited into your account, Total balance is:"+balance);
	}

	public static void main(String[] args) throws InterruptedException {
		Example8 e8=new Example8();
		e8.start();
		e8.deposit(100000);

	}

}
