package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(5);
		c.add('A');
		c.add("Rays");
		c.add(5.0);
		c.add(true);

		System.out.println(c);

		Iterator it = c.iterator();

		while (it.hasNext()) {

			Object o = (Object) it.next();

			System.out.println(o);

		}

	}

}
