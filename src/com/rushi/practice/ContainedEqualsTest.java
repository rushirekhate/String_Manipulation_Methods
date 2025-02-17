package com.rushi.practice;

public class ContainedEqualsTest {

	public static void main(String[] args) {
		
		
		String s1 ="ab";
		String s2 = "ab";
		String s3 ="ba";
		
		System.out.println(s1.contentEquals(s2));
		System.out.println(s2.contentEquals(s3));
		System.out.println(s1.equals(s2));
	}

}
