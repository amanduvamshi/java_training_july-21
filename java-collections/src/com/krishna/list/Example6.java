package com.krishna.list;

import java.util.HashMap;
import java.util.Map;

public class Example6 {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.setName("Ramu");
		p.setAge("29");
		
		Person p1=new Person();
		p1.setName("Raju");
		p1.setAge("30");
		
		Person p2=new Person();
		p2.setName("Ramu");
		p2.setAge("29");
		
		Map<Person, String> persons=new HashMap<Person,String>();
		
		persons.put(p, "Manager");
		persons.put(p1, "clerk");
		persons.put(p2, "Manager");
		
		System.out.println(persons);

	}

}
