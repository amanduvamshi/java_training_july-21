package com.krishna.list;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Example8 {
	
	

	public static void main(String[] args) {
		
		//Map<String, Integer> namesAndAges = new HashMap<>();

		/*
		 * namesAndAges.put("Krishna", 29); namesAndAges.put("vamshi", 28);
		 * namesAndAges.put(null, 30);
		 * 
		 * System.out.println(namesAndAges);
		 */
		
		SortedMap<String, Integer> namesAndAges = new TreeMap<>();

		namesAndAges.put("Krishna", 29);
		namesAndAges.put("Vamshi", 28);
		namesAndAges.put("Nirvi", 1);

		System.out.println(namesAndAges);
		 
		
	}

}
