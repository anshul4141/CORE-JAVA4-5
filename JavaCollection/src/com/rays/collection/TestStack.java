package com.rays.collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push("Anshul");
		s.push("Prajapati");
		s.push(100);

		System.out.println(s);

		System.out.println(s.peek());

		System.out.println(s);

		System.out.println(s.pop());

		System.out.println(s);

		System.out.println(s.pop());

	}

}
