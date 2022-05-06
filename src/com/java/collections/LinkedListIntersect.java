package com.java.collections;

public class LinkedListIntersect {
	
	// list node definition
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	
	public ListNode getIntersection(ListNode headA, ListNode headB) {
		
		// check if either head is null, no intersection
		if(headA == null || headB == null) {
			return null;
		}
		
		// create a pointer for each list
		ListNode aPointer = headA;
		ListNode bPointer = headB;
		
		// loop until the pointers match
		while(aPointer != bPointer) {
			
			if(aPointer == null) {
				aPointer = headB;
			} else {
				aPointer = aPointer.next;
			}
			
			if(bPointer == null) {
				bPointer = headA;
			} else {
				bPointer = bPointer.next;
			}	
		}
		
		// return either pointer when they are equal
		return aPointer;
	}
}