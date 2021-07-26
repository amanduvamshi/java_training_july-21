package com.krishna;

public class Example9 extends Thread{

int balance=1000;
	
	public void run() {
		try {
			withdraw(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void withdraw(int amount) throws InterruptedException {
		//Thread.sleep(1000);
		if(balance> amount) {
			System.out.println("please collect cash.."+amount);
		}else {
			System.out.println("Insufficient funds.");
		}
	}
	
	public synchronized void deposit(int amount) throws InterruptedException {
		Thread.sleep(1000);
		balance=balance+amount;
		System.out.println("Amount creadited into your account, Total balance is:"+balance);
	}

	public static void main(String[] args) throws InterruptedException {
		Example9 e9=new Example9();
		e9.start();
		e9.deposit(100000);
	}

}
