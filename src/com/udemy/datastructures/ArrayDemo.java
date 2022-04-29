package com.udemy.datastructures;

public class ArrayDemo {

	String name = "Jack";
	
	String[] names = new String[10];
	
	public void insert() {
		names[0] = "Jack";
		names[1] = "Ali";
		names[2] = "Rahul";
	}
	
	public void displayArray() {
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayDemo ac = new ArrayDemo();
		ac.insert();
		ac.displayArray();

	}

}
