package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

// set does not contain duplicate value
// set contain only one null value
// set by default ascending order

public class TestSet {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add("KGF");
		s.add("KGF");
		s.add('A');
		s.add(5.2);
		s.add(5);
		s.add(null);
		s.add(null);

		System.out.println(s);

	}

}
