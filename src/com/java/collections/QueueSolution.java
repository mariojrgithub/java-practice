package com.java.collections;

class QueueUsingArray {
	int frontQ;
	int rearQ;
	int capacityOfQueue;
	static int[] q1;
	
	QueueUsingArray(int size) {
		capacityOfQueue = size;
		q1 = new int[capacityOfQueue];
	}
	
	void enqueue(int value) {
		if(rearQ == capacityOfQueue) {
			System.out.println("Queue id already full");
		} else {
			q1[rearQ] = value;
			rearQ++;
		}
	}
	
	void dequeue() {
		if(rearQ == 0) {
			System.out.println("Queue is empty, there is nothing do delete");
		} else {
			for(int i = 0; i < rearQ - 1; i++) {
				q1[i] = q1[i+1];
			}
			rearQ--;
		}
	}
	
	void display() {
		if(rearQ == 0) {
			System.out.println("Queue is empty, there is nothing do delete");
		} else {
			for(int i = 0; i < rearQ; i++) {
				System.out.println(q1[i]);
			}
		}
	}
}

public class QueueSolution {

	public static void main(String[] args) {

		QueueUsingArray q2 = new QueueUsingArray(5);
		q2.enqueue(2);
		q2.enqueue(4);
		q2.enqueue(8);
		
		q2.display();
		
		
	}

}
