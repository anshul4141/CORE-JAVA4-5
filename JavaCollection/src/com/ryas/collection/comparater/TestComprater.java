package com.ryas.collection.comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComprater {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("bbv", 1, 5000));
		list.add(new Employee("abv", 2, 5000));

		TestCompraterbyId id = new TestCompraterbyId();

		Collections.sort(list, id);

		for (Employee employee : list) {

			System.out.println("Employee compare by id = " + employee);

		}

		System.out.println("---------------------------");

		TestCompareByName name = new TestCompareByName();

		Collections.sort(list, name);

		for (Employee employee : list) {

			System.out.println("Employee compare by name = " + employee);

		}

	}

}
