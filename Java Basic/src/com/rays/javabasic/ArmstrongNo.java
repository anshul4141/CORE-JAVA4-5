package com.rays.javabasic;

public class ArmstrongNo {

	public static void main(String[] args) {

		int no = 153;
		int tempNo = no;
		int r;
		int sum = 0;

		while (tempNo != 0) {

			r = tempNo % 10;
			sum = (sum + r*r*r);
			tempNo = tempNo / 10;

		}
		
		System.out.println("sum = " + sum);
		
		if(sum == no) {
			System.out.println("this is armstrong no");
		} else {
			System.out.println("this is not armstrong no");
		}

	}

}
