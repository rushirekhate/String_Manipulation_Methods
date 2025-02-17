package com.rushi.practice;

public class EqualsTest {

	public static void main(String[] args) {
		
		String s1 ="R";
		String s2 = "R";
		
		String s3 = new String("R");
		String s4 = new String("R");
		
		// ==  compare to refrance/addres
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		// equals method check contain
		System.out.println("s1.equals(s2) :: "+s1.equals(s2));
		System.out.println("s3.equals(s4) :: "+s3.equals(s4));
		
		
		String s5 = "a";
		String s6 = "A";
		
		System.out.println("s5.equals(s6) :: "+s5.equals(s6));
		System.out.println("s5.equalsIgnoreCase(s6) :: "+s5.equalsIgnoreCase(s6));
		

	}

}
