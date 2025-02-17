package com.rushi.practice;

public class setCharAt {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc abc abc");
		System.out.println("SB Chars : "+sb);
		
		sb.setCharAt(3,'_');
		System.out.println(sb);

	}

}
