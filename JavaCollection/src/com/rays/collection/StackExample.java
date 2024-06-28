package com.rays.collection;

import java.util.Stack;

// last in first out first in last out
public class StackExample {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char i = 'a'; i <= 'z'; i++) {

			s.push(i);

		}

		System.out.println(s);

		Stack s1 = new Stack();

		while (!s.isEmpty()) {

			s1.push(s.pop());

		}

		System.out.println(s1);

	}

}
