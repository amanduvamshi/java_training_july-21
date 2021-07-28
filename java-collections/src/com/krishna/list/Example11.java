package com.krishna.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example11 {

	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<>();	
		
		System.out.println("***** Natural Order Using Comparable *****");
		
		
		employees.add(new Employee("Vh", "E24", "SubjectExpert", 40));
		employees.add(new Employee("Rh", "E25", "Developer", 25));
		employees.add(new Employee("Dh", "E23", "sr.Arch", 30));
		
		Collections.sort(employees);
		
		System.out.println(employees);
		
		System.out.println("***** Sorting Based On Name *****");
		
		Collections.sort(employees, new NameCompare());
		
		System.out.println(employees);
		

	}

}
