package com.krishna.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example9 {
	
	public static void main(String[] args) {
		
		
		  Map<String,Integer> namesAndAges=new HashMap<>();
		  
		  namesAndAges.put("Krishna",29); 
		  namesAndAges.put("vamshi",28);
		  namesAndAges.put(null, 30);
		  
		  System.out.println("Get All Keys: "+namesAndAges.keySet());
		  System.out.println("Get All Values:"+namesAndAges.values());
		  System.out.println("Entry Set:"+namesAndAges.entrySet());
	      System.out.println("isKeyExist:"+namesAndAges.containsKey("Krishna"));
	      System.out.println("isValueExist:"+namesAndAges.containsValue(29));
	      
	     //Assignment to print key value pairs.
	    
	}

}
