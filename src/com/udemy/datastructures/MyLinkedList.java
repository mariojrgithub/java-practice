package com.udemy.datastructures;

public class MyLinkedList {
	
	private Node head;
	
	public MyLinkedList() {
		this.head = new Node("Head Node");
	}
	
	public void add(String data) {
		Node newNode = new Node(data);
	
		Node current = head;
		
		while(current.getNext() != null) {
			current = current.getNext();
		}
		
		current.setNext(newNode);
	
	}
	
	public void displayLinkedList() {
		
		Node current = head;
		
		while(current.getNext() != null) {
			
			System.out.println(current.getData());

			current = current.getNext();
			
			if(current.getNext() == null) {
				System.out.println(current.getData());
			}
		}
	}
	
	private class Node {
		
		private Node next;
		private String data;
		
		public Node(String data) {
			this.data = data;
			this.next = null;
		}
		
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		
		
	}

}
