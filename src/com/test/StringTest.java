package com.test;

public class StringTest {

	public static void main(String[] args) {
		String s1= "ravi";
		String s3= "Ravi";
		String s2= new String("ravi");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 ==s2.intern());
	}
}
