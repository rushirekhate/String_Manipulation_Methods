package com.rushi.practice;

public class AppendTest {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("SB capacity "+sb.capacity());
		System.out.println("SB length "+sb.length());
		System.out.println("Sb chars "+sb);
		
		sb.append("a");
		System.out.println("SB Capacity "+sb.capacity());
		System.out.println("SB length "+sb.length());
		System.out.println("SB chars "+sb);
		
				

	}

}
