package com.krishna.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		
		
		
		  LinkedList<String> names=new LinkedList<String>();
		  System.out.println("Free Memory:"+ Runtime.getRuntime().freeMemory());
		  for(int i=0;i<100000;i++) names.add("name:"+i);
		  System.out.println("Free Memory:"+ Runtime.getRuntime().freeMemory());
		 
		 
		
		/*
		 * ArrayList<String> names=new ArrayList<String>();
		 * System.out.println("Free Memory:"+ Runtime.getRuntime().freeMemory());
		 * for(int i=0;i<100000;i++) names.add("name:"+i);
		 * System.out.println("Free Memory:"+ Runtime.getRuntime().freeMemory());
		 */
		
		
		

	}

}
