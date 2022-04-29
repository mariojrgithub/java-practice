package com.java.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackSolution {

	public static void main(String[] args) {
		// create
		Stack<Integer> s1 = new Stack<>();
		// insert
		s1.push(5);
		s1.push(2);
		s1.push(9);
		s1.push(4);
		
		System.out.println(s1);
		// delete/remove
		s1.pop();
		
		System.out.println(s1);
		
		// peek
		System.out.println(s1.peek());
		
		// check if is empty
		boolean status = s1.empty();
		
		System.out.println(status);
		
		// search
		int indexFound = s1.search(4);
		System.out.println(indexFound);
		
		// iteration
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// check size
		int size = s1.size();
		System.out.println("The size of s1 is " + size);
		
		// sort
		s1.sort(null);
		System.out.println(s1);
	}

}
