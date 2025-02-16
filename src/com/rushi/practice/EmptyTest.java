package com.rushi.practice;

public class EmptyTest {

	public static void main(String[] args) {
		
		String s1 = "";
		String s2 = " ";
		String s3 = "a";
		
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("a");
		
		System.out.println("S1 Empty :: "+s1.isEmpty());
		System.out.println("S2 Empty :: "+s2.isEmpty());
		System.out.println("S3 Empty :: "+s3.isEmpty());
		System.out.println("S4 Empty :: "+s4.isEmpty());
		System.out.println("S5 Empty :: "+s5.isEmpty());
		System.out.println("S6 Empty :: "+s6.isEmpty());
		System.out.println("S7 Empty :: "+s7.isEmpty());
		
	}

}
