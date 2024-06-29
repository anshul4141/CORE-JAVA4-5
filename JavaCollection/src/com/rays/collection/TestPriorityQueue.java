package com.rays.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		
		Queue a = new PriorityQueue();
		
		a.offer('5');
		a.offer(5);
		
		System.out.println(a);
		
	}

}
