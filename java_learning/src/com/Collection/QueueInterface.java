package com.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface  {
public static void main(String[] args) {
	Queue<Integer> q = new PriorityQueue<Integer>();
	q.add(20);
	q.add(30);
	q.add(40);
	q.add(50);
	q.add(30);
	q.add(50);
	System.out.println(q);
	System.out.println(q.contains(20));
	System.out.println(q.isEmpty());
	System.out.println(q.hashCode());
	System.out.println(q.size());
	System.out.println(q.remove(50));
	System.out.println(q);
	System.out.println();
	System.out.println(q.offer(100));
	System.out.println(q);
	System.out.println(q.element());
	for(int i = 1; i<=100; i++) {
		System.out.println(i);
	}
}
}
