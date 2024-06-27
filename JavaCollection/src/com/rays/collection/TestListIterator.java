package com.rays.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(65);
		list.add('A');
		list.add("KGF");
		list.add(null);
		list.add("KGF");

		System.out.println(list);

		ListIterator lit = list.listIterator();

		while (lit.hasNext()) {

			Object o = lit.next();
			
			System.out.println(o);

		}

	}

}
