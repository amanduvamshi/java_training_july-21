package com.krishna.list;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		
		ArrayList<String> values = new ArrayList<String>();
		values.add("Ramu");
		values.add("vir");
		values.add("Krishna");
		values.add("Raju");
		
	    System.out.println("Get Value:"+values.get(2));
	    System.out.println("Remove value:"+values.remove(1));
	    System.out.println("Remove value:"+values.indexOf("Raju"));
	    
	    ArrayList<String> fruitNames = new ArrayList<String>();
	    
	    fruitNames.add("Apple");
	    fruitNames.add("Mango");
	  
	    values.addAll(fruitNames);
	    
	    fruitNames.clear();
	   
	    System.out.println("Fruit Names:"+ fruitNames);
	    
	    System.out.println("values:"+values);
	    
	    values.set(4, "cherry");
	    
	    System.out.println("After set:"+values);
	    
	    values.add(1, "vamshi");
	    
	    System.out.println("values:"+values);
	    
	    values.remove(1);
	    
	    System.out.println(" Remove using index position:"+values);
	    
	    values.remove("cherry");
	    
	    System.out.println("Remove using object.."+values);
	    
	    
	}

}
