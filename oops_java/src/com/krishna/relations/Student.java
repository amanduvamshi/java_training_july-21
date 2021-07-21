package com.krishna.relations;

public class Student extends Person {
	
	String studentId;
	String collegeName;
	
	Address address;
	

	public static void main(String[] args) {
		

		Student student = new Student();
		student.setName("Krishna");
		student.setAge(29);
		student.studentId="A123";
		student.collegeName="SRIT";
		
		Address address =new Address();
		address.setStreetName("Namdevwada");
		address.setStreetNumber("StreetNo:9");
		student.address=address;
	}

}
