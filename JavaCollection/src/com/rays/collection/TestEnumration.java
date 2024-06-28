package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(65);
		v.add('A');
		v.add("KGF");
		v.add(null);
		v.add("KGF");

		System.out.println(v);

		Enumeration en = v.elements();

		v.add(66);

		while (en.hasMoreElements()) {
			Object object = (Object) en.nextElement();
			System.out.println(object);

		}

	}

}
