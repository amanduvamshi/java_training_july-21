package com.krishna.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example10 {

	public static void main(String[] args) {
		
		/*
		 * SortedMap<String, Integer> numberTextsAndDigits=new TreeMap<>();
		 * 
		 * numberTextsAndDigits.put("Ten", 10); numberTextsAndDigits.put("Fifty",50);
		 * numberTextsAndDigits.put("OneThousand",1000);
		 * 
		 * System.out.println(numberTextsAndDigits);
		 */
		
		/*
		 * List<String> cities=new ArrayList<>(); cities.add("Hyderbad");
		 * cities.add("Mumbai"); cities.add("Banglore");
		 * System.out.println("Before Sort:"+cities); Collections.sort(cities);
		 * System.out.println("After Sort:"+cities);
		 */
		
		List<Person> persons=new ArrayList<>();
		
		persons.add(new Person("krishna", "28"));
		persons.add(new Person("Ramu", "40"));
		
		//Collections.sort(persons);
		
		
		
		  List<Employee> employees=new ArrayList<>();
		  
		  employees.add(new Employee("Vihar", "V123", "Manager", 37));
		  employees.add(new Employee("Vinil", "V129", "Developer", 24));
		  employees.add(new Employee("Aman", "V124", "Clerk", 40));
		  
		  System.out.println("********Before Sort*********:");
		  System.out.println(employees);
		  
		  Collections.sort(employees);
		  
		  System.out.println("********After Sort*********:");
		  System.out.println(employees);
		  
		  System.out.println("********Reverse Sort*********:");
		  Collections.reverse(employees);
		  
		  System.out.println("Reverse Order:"+employees);
		 
		

	}

}
