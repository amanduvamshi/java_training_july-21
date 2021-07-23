package com.krishna;

import java.util.ArrayList;
import java.util.List;

public class EXample1 {

	public void checkedExceptionMethod() throws ClassNotFoundException {
		Class.forName("com.krishna.A");
	}

	public int unCheckedExceptionMethod() {
		return 10 / 0;
	}

	public void errorFlowExample() {
		errorFlowExample();
	}

	public static void main(String[] args) throws ClassNotFoundException {

		// new EXample1().checkedExceptionMethod();

		List<byte[]> list = new ArrayList<>();
		int index = 1;
		while (true) {

			byte[] b = new byte[1048576];
			list.add(b);
			Runtime runTime = Runtime.getRuntime();
			System.out.println("free memory: " + (index++) + runTime.freeMemory());
		}

	}

	public void checkClassCastException(EXample1 e2) {
		// TODO Auto-generated method stub

	}

}
