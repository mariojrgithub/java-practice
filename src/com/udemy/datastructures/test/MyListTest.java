package com.udemy.datastructures.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.udemy.datastructures.MyList;

class MyListTest {

	@Test
	void testAdd() {
		String element = "123";
		MyList instance = new MyList();
		instance.add(element);
		assertEquals(1, instance.size());
	}

	@Test
	void testRemove() {
		String element = "123";
		MyList instance = new MyList();
		instance.add(element);
		instance.remove(element);
		assertEquals(0, instance.size());
	}

	@Test
	void testSize() {
		MyList instance = new MyList();
		int expectedResult = 0;
		int result = instance.size();
		assertEquals(expectedResult, result);
	}

	@Test
	void testGet() {
		int index = 0;
		MyList instance = new MyList();
		String expectedResult = "First element";
		instance.add(expectedResult);
		String result = instance.get(index);
		assertEquals(expectedResult, result);
	}

	@Test
	void testContains() {
		String element = "123";
		MyList instance = new MyList();
		boolean expectedResult = true;
		instance.add(element);
		boolean result = instance.contains(element);
		assertEquals(expectedResult, result);
	}

	@Test
	void testGetIndex() {
		String element = "123";
		MyList instance = new MyList();
		int expectedResult = 0;
		instance.add(element);
		int result = instance.getIndex(element);
		assertEquals(expectedResult, result);
	}

}
