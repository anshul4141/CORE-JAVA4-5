package com.rays.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put('A', 42);
		map.put(42, 'A');
		map.put("Movie", "KGF");
		map.put("Movie1", "KGF");

		System.out.println(map.get(42));

		System.out.println(map.containsKey("Movie"));

		System.out.println(map.isEmpty());

		System.out.println(map);

		Collection c = map.values();

		for (Object object : c) {

			System.out.println("Values = " + object);

		}

		Set s = map.entrySet();

		for (Object object : s) {

			System.out.println("key and value = " + object);

		}

		map.clear();
		System.out.println(map.isEmpty());

	}

}
