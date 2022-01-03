/**
 * @author Andrew Crenwelge
 */

package com.revature.oop.polymorphism;

public class Overloading {
	
	/*
	 * This class provides examples of method overloading
	 */

	public static void main(String[] args) {
		overloadMe();
		overloadMe("some string");
		overloadMe("hello",45);
		overloadMe(10,"goodbye");
	}
	
	public static void overloadMe() {
		System.out.println("no-arg method");
	}
	
	public static void overloadMe(String s) {
		System.out.println("method with one arg: "+s);
	}
	
	public static void overloadMe(String s, int i) {
		System.out.println("method with two args: "+s+", "+i);
	}
	
	public static void overloadMe(int i, String s) {
		System.out.println("method with two args: "+i+", "+s);
	}

}
