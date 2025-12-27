package com.queue;
import java.util.*;
public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(79);
		queue.add(-99);
		queue.add(143);
		queue.add(-143);
		queue.add(777);
		queue.add(111);
		while(queue.size()>0) {
			System.out.println(queue.remove());
		}
	}
}
