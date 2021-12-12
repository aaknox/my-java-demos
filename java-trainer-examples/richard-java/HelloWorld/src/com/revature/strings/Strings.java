package com.revature.strings;

public class Strings {
	public static void main(String[] args) {
		String s = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println("s==s2="+ (s == s2));
		
		System.out.println("s.equals(s2)="+s.equals(s2));
		
		
		System.out.println("s3==s2="+(s3 == s2));
		
		System.out.println("s3.equals(s2)="+s3.equals(s2));
		
		s3 = s3.intern();
		System.out.println("s3==s2="+(s3 == s2));
		
		System.out.println("s3.equals(s2)="+s3.equals(s2));
	}
}
