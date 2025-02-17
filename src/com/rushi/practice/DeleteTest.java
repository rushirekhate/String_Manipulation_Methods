package com.rushi.practice;

public class DeleteTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Rushikesh Rekhate");
		System.out.println("SB Chars :: "+sb);
		
		sb.delete(3, 9);
		
		System.out.println("SB Chars :: "+sb);
		
		sb.deleteCharAt(2);
		
		System.out.println("SB Char :: "+sb);

	}

}
