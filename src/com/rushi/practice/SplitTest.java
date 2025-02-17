package com.rushi.practice;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		
		String s1 ="Rushikesh Rekhate";
		String[] st = s1.split(" ");
		
		System.out.println(s1.toString());
		System.out.println(st.toString());
		System.out.println(Arrays.toString(st));
		System.out.println(st.length);

	}

}
