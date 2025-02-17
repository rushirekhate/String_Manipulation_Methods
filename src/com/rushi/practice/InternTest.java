package com.rushi.practice;

public class InternTest {

	public static void main(String[] args) {
		
		String s1 ="Rushi";
		String s2 = s1.intern();
		
		System.out.println(s1==s2);
		
		String s3 = new String("Rushi");
		String s4 = s3.intern();
		
		System.out.println(s3==s4);
		
		String s5="Rushi";
		System.out.println(s4==s5);
	}

}
