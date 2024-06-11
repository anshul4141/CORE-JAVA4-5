package com.rays.javabasic;

public class ReverseNo {

	public static void main(String[] args) {

		int no = 123;
		int temp = no;
		int r = 0;
		int sum = 0;

		while (temp > 0) {

			r = temp % 10;

			sum = (sum * 10) + r;

			temp = temp / 10;

		}

		System.out.println("your no is = " + sum);

		if (sum == no) {

			System.out.println("palindrom no");

		} else {

			System.out.println("not palindrom no");
		}

	}

}
