package com.java.collections;


public class LinkedListCycleStart {
	
		// list node definition
		public class ListNode {
			int val;
			ListNode next;
			ListNode(int x){
				val = x;
				next = null;
			}
		}
		
		public ListNode findCycleStart(ListNode head) {
			
			// return null if there is an invalid list
			if(head == null) {
				return null;
			}
			
			// change to true if a cycle is detected
			boolean isCycle = false;
			
			// assign a fast and slow pointer
			ListNode slow = head;
			ListNode fast = head;
			
			// loop through the list until fast and slow meet
			while(slow != null && fast != null) {
				slow = slow.next;
				fast = fast.next.next;
				
				// when slow and fast meet, there is a cycle
				if(slow == fast) {
					isCycle = true;
					break;
				}
			}
			
			if(isCycle) {
				// assign a new pointer at the head
				ListNode slow2 = head;
				// while the pointers are not equal, step through the list one at a time
				while(slow != slow2) {
					slow = slow.next;
					slow2 = slow2.next;
				}
				// return either pointer when they meet
				return slow;
			}
			
			return null;
		
		}

}
