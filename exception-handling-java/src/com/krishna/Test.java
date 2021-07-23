package com.krishna;

public class Test {

	public void checkUserInfo(String name) throws UserNotFoundException {
		User user = new User();
		user.setName("krishna");

		if (user.getName() == name) {
			System.out.println("welcome...");
		} else {
			throw new UserNotFoundException("user doesn't exist ");
		}
	}
	
	public int testDebug() {
		return 1;
	}

	public static void main(String[] args) throws UserNotFoundException {
		Test t = new Test();
		//t.checkUserInfo("krishna");
		//t.checkUserInfo("ramu");		
		//t.testDebug();

	}

}
