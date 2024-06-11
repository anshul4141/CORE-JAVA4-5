package com.rays.javabasic;

public class FindGrade {

	public static void main(String[] args) {

		int marks = 60;

		switch (marks) {
		case (61):
			System.out.println("grade = c");
			break;
		case 81:
			System.out.println("grade = b");
			break;
		case 91:
			System.out.println("grade = a");
			break;

		default:
			System.out.println("fail");
			break;
		}

//		if (marks >= 90) {
//
//			System.out.println("a");
//
//		} else if (marks >= 80) {
//
//			System.out.println("b");
//
//		} else if (marks >= 60) {
//			System.out.println("c");
//		} else {
//
//			System.out.println("fail");
//
//		}

	}

}
