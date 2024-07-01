package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student("Punit", 5));
		list.add(new Student("Joggi", 4));
		list.add(new Student("Ramdulera", 1));
		list.add(new Student("Aryan", 2));
		list.add(new Student("Vinjal", 0));

		Collections.sort(list);

		for (Student student : list) {

			System.out.println(student);

		}

	}

}
