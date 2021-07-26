package com.krishna.list;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		
		ArrayList<String> values = new ArrayList<String>();
		values.add("Ramu");
		values.add("vir");
		values.add("Krishna");
		values.add("Raju");
		System.out.println("Values:"+values);
		
		for(int i=0;i<values.size();i++) {
			
			if("Krishna".equals(values.get(i))) {
				System.out.println(values.get(i));
			}
		}
	}

}
