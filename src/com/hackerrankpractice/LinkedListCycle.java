package com.hackerrankpractice;

public class LinkedListCycle {

	class Node {
		int data;
		Node next;
	}
	
	boolean hasCycle(Node head) {
		if(head == null) {
			return false;
		}
		Node fast = head.next;
		Node slow = head;
		while(fast != null && fast.next != null && slow != null) {
			if(fast == slow) {
				return true;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
	
	}
}
