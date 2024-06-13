package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculater {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		System.out.println("today date = " + today);
		
		LocalDate birtDate = LocalDate.of(2004, 05, 19);
		
		Period p = Period.between(birtDate, today);
		
		System.out.println("age = " + p.getYears());
		System.out.println("days = " + p.getDays());
		System.out.println("month = " + p.getMonths());
		
		
		
	}

}
