package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestShortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add(5);
		s.add(4);
		s.add(3);
		s.add(2);
		s.add(1);

		System.out.println(s.first());
		System.out.println(s.last());

		System.out.println(s);

		for (Object object : s) {

			System.out.println(object);

		}

	}

}
