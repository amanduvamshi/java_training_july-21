package com.krishna;

public class Example16 {

	public int method1() {

		return 10 / 0;

	}

	public static void main(String[] args) throws NumberException {

		Example16 e1 = new Example16();

		try {
			e1.method1();
		} catch (Exception e) {
			//e.printStackTrace();
			throw new NumberException(e.getMessage());
		}
	}

}
