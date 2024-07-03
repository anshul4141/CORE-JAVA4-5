package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Suman");
		list.add("Aman");
		list.add("Suman");
		list.add("tarun");
		list.add("Karan");
		list.add("tanmay");

		System.out.println(list);

		System.out.println("UpperCase");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		System.out.println("------------");
		System.out.println("LowerCase");
		list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
		System.out.println("------------");
		System.out.println("Sorted order");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("------------");
		System.out.println("Sorted order and UpperCase");
		list.stream().sorted().map(e -> e.toUpperCase()).forEach(System.out::println);
		System.out.println("-----------");
		System.out.println("Remove duplicate");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("-----------");
		System.out.println("Start with T");
		list.stream().filter(e -> e.startsWith("t")).forEach(System.out::println);

	}

}
