package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee("Ram", 10000, "Indre");

		Employee e2 = new Employee("Syam", 20000, "Bhopal");

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);

		

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Employee emp = (Employee) it.next();

			System.out.println(emp.getName());
			System.out.println(emp.getSalary());

		}

	}

}
