package com.krishna;

public class Example7 extends Thread {
	
	private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
    
    public void run() {
    	
    		increment();
        	
    	
    }

	public static void main(String[] args) {
		
		Example7 e7=new Example7();
		e7.start();
		
		System.out.println("");
		  e7.decrement();
		  System.out.println("c value after decrement."+e7.c);
		
		
		
		
	}

}
