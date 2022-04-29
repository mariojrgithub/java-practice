package com.udemy.datastructures;

public class ExecuteList {

	public static void main(String[] args) {

		MyList list = new MyList();
		list.add("item 1");
		list.add("item 2");
		list.add("item 3");
		list.add("item 4");
		list.add("item 5");
		list.add("item 6");
		list.add("item 7");
		list.add("item 8");
		list.add("item 9");
		list.add("item 10");
		list.add("item 11");
		list.add("item 12");
		list.add("item 13");
		list.add("item 14");
		list.add("item 15");
		
		list.remove("item 9");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println(list.getIndex("item 70"));
	}

}
