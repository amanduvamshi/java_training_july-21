package com.krishna;

public class Example7 {

	public static void main(String[] args) {
		   try {
			   System.out.println("Try started...");
		    	  int a=10/0;
		       System.out.println("Try Ended....");  
		    	  
		      }catch(Exception e) {
		    	  System.out.println("error");
		      }finally {
		    	  System.out.println("finally");
		      }
		      System.out.println("outside of try catch fially..");

	}

}
