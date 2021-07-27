package com.krishna.list;

import java.util.HashSet;

public class Example7 {
	
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
		
		//HashSet<Person> set =new HashSet<Person>();
		HashSet<String> set =new HashSet<>();
		
		/*
		 * set.add(p); set.add(p1); set.add(p2);
		 */
		
		set.add("1");
		set.add("1");
		
		System.out.println(set);
		
	}

}
