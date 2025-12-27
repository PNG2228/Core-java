package com.queue;
import java.util.*;
public class ArrayDeckExample {
	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(20);
		deque.addFirst(40);
		deque.addFirst(100);
		deque.removeLast();
		deque.addFirst(120);
		deque.add(140);
		deque.addFirst(170);
		deque.add(200);
		deque.addFirst(440);
		deque.remove();
		deque.removeLast();
		deque.addFirst(720);
		deque.remove();
		deque.add(570);
		System.out.println(deque);
	}
}
