package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(6);
		c.add('A');
		c.add("Rays");
		c.add(5.0);
		c.add(true);

		System.out.println("All elements = " + c);

		System.out.println("c contains 5.0 = " + c.contains(5.0));

		System.out.println("__________________");

		Collection c1 = new ArrayList();

		c1.add(6);
		c1.add('A');
		c1.add("NCS");
		c1.add(6.0);
		c1.add(false);

		// c.addAll(c1);

//		System.out.println("c or c1 elements = " + c);
//
//		System.out.println(c.containsAll(c1));
//
//		System.out.println("check c isempty or not = " + c.isEmpty());
//
//		System.out.println(c);
//
//		c.remove("Rays");
//
//		System.out.println(c);

		c.retainAll(c1);

		System.out.println(c);

	}

}
