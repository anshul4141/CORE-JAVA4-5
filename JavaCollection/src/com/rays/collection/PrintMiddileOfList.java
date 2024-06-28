package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class PrintMiddileOfList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(65);
		list.add('A');
		list.add("KGF");
		list.add(null);
		list.add(66);
		list.add(55);
		list.add(77);

		System.out.println(list.size());

		System.out.println(list.get((list.size() - 1) / 2));

	}

}
