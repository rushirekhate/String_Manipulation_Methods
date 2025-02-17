package com.rushi.practice;

public class CompareToTest {

	public static void main(String[] args) {
	
		String s1 ="R";
		String s2 = "R";
		String s3 = "r";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1.compareToIgnoreCase(s3));
			
		

	}

}
