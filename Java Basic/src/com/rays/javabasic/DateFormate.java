package com.rays.javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
	
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/yyyy/dd");
		
		String str = sdf.format(d);
		String str1 = sdf1.format(d);
		
		System.out.println("formate date = " + str);
		System.out.println("formate date = " + str1);
		
		String date = "25/01/2002";
		
		Date d1 = sdf.parse(str);
		
		System.out.println("String to date = " + d1);
		
	}

}
