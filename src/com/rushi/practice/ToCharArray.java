package com.rushi.practice;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		
		String s1="Rushikesh";
		
		char[] s2 =s1.toCharArray();
		byte[] s3 = s1.getBytes();
		
		System.out.println(s1);
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(s3));

	}

}
