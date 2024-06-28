package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(65);
		list.add('A');
		list.add("KGF");
		list.add(null);
		list.add("KGF");

		System.out.println(list);

		Set s = new HashSet(list);

		System.out.println(s);

	}

}
