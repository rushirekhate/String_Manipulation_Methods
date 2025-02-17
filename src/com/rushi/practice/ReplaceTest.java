package com.rushi.practice;

public class ReplaceTest {

	public static void main(String[] args) {
		
		String s1 ="abc abc abc";
		s1.replace('a', 'c'); // no change 
		System.out.println(s1);
		
		String s2 = s1.replace('b', 'c');
		System.out.println(s2);
		
		String s3 = s1.replaceAll("abc", "@");
		System.out.println(s3);

	}

}
