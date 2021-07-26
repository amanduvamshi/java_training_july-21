package com.krishna;

public class Example5 extends Thread {

	public void run() {

		synchronized (this) {
			for (int i = 0; i <= 50; i++)
				if (i == 50) {
					System.out.println("I'm Ramu");
					System.out.println("I'm from ayodya...");
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("...Vanara sena fought against Ravana's army...");
				}

		}

	}

	public static void main(String[] args) throws InterruptedException {

		Example5 e5 = new Example5();
		e5.start();

		System.out.println("Hi my name is krishna");
		System.out.println("I'm from dwaraka..");

		System.out.println("Nice to meet you.");

	}
}
