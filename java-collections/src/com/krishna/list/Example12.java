package com.krishna.list;

import java.util.Stack;

public class Example12 {

	public static void main(String[] args) {
		
		//Last In First Out.
		Stack stack=new Stack<>();
		stack.push("Krishna");
		stack.push("Ram");
		stack.push("Arjun");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		
		//First In First Out.
		
		// Priority Queue, LinkedList,PriorityBlockingQueue.

	}

}
