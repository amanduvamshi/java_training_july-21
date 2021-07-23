package com.krishna;

public class Example9 {

	public static void main(String[] args) {

		try {
			System.out.println("... Try Started ....");
			int a = 10 / 0;
			System.out.println("Try Ended...");
		} catch (Exception e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally...");
		}

	}

}
