package com.java.collections;

public class NeedOfCollections {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		
		int[] arArray = new int[10000];
		
		// limitations of an array:
		// 1. Arrays are fixed in size
		// 2. Arrays can hold only homogeneous data elements
		
		Student[] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
//		students[2] = new Book(); // cannot do
		
		Object[] objects = new Object[10];
		objects[0] = new Student();
		objects[1] = new Student();
		objects[2] = new Book(); // can do
		
		// 3. Ready made APIs support is not available in array
		
	}

}

class Book {
	
}

class Student {
	
}