package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListNormalIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(65);
		list.add('A');
		list.add("KGF");
		list.add(null);
		list.add("KGF");

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Object o = it.next();

			System.out.println(o);

		}

	}

}
