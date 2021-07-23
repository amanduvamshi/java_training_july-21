package com.krishna;

public class Example8 {

	public static void main(String[] args) {

		try {
			System.out.println("... Try Started ....");
			int a = 10 / 0;
			System.out.println("Try Ended...");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} catch (Throwable t) {
			System.out.println(t);
		}finally {
			System.out.println("finally...");
		}

	}

}
