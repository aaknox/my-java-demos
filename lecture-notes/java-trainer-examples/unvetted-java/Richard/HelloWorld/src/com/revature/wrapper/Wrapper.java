package com.revature.wrapper;

import java.util.Arrays;
import java.util.Scanner;

public class Wrapper {
	//primitives
	/*
	 * boolean - ? (JVM dependent) - Boolean
	 * byte - 1 bytes - Byte
	 * char - 2 bytes - Character
	 * short - 2 bytes - Short
	 * int - 4 bytes - Integer
	 * float - 4 bytes - Float
	 * long - 8 bytes - Long
	 * double - 8 bytes - Double
	 */

	public static void main(String[] args) {
//		System.out.println(Byte.BYTES);
//		System.out.println("Max Long = "+Long.MAX_VALUE);
//		System.out.println("Max Double = "+Double.MAX_VALUE);
		//comparingPrimitivesAndWrappers();
		//parsing();
		overloading();
	}
	/* Overloading preference
	 * 1. Exact match
	 * 2. Implicit Casting (type conversion)
	 * 3. Boxing (auto-boxing or unboxing)
	 * 4. varargs
	 */
	private static void overloading() {
		int intPrimitive = 5;
		Integer intObject = 5; // new Integer(5);
		
		short shortPrimitive = 5;
		Short shortObject = 5;
		
		long longPrimitive = 5;
		Long longObject = 5l;
		
		float floatPrimitive = 5;
		Float floatObject = 5.0f;
		
		double doublePrimitive = 5;
		Double doubleObject = 5.0;
		
		//method(intPrimitive);
		method(shortPrimitive);
		method(intPrimitive, longPrimitive);
		method(intPrimitive, longObject);
		method((int)shortPrimitive, longPrimitive);
		method(new Integer(5), 5, 5, 5, 5, 5);
	}
	
	public static void method(int x) {
		System.out.println("primitive int passed: "+ x);
	}
	public static void method(Short x) {
		System.out.println("object Short passed: "+ x);
	}
	public static void method(Integer x, long y) {
		System.out.println("object Integer, primitive long passed: "+ x +", "+y);
	}
	public static void method(int y, Integer... x) {
		System.out.println("varargs int passed: "+ Arrays.toString(x));
	}

	private static void parsing() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		Double d = Double.parseDouble(s);
		System.out.println(d);
	}

	private static void comparingPrimitivesAndWrappers() {
		int intPrimitive = 5;
		Integer intObject = 5; //new Integer(5);
		
		short shortPrimitive = 5;
		Short shortObject = 5;
		
		long longPrimitive = 5l;
		Long longObject = 5l;
		
		// 5 is an integer. 5.0 is a double. 5f or 5.0f is a float
		float floatPrimitive = 5.0f;
		Float floatObject = 5.0f;
		
		double doublePrimitive = 5;
		Double doubleObject = 5.0;
		
		// Auto-unboxing - Then jvm will automatically "unwrap" the object to a primitive type
		System.out.println("intPrimitive == intObject: "+ (intPrimitive == intObject));
		
		// the == operator compares memory locations of objects
		System.out.println("int Object == new Integer(5): "+ (intObject == new Integer(5)));
		
		// compare values of objects using .equals
		System.out.println("intObject.equals(new Integer(5): "+ (intObject.equals(new Integer(5))));
		 
		// always returns false if the object is not of the same type
		System.out.println("intObject.equals(longObject): "+(intObject.equals(longObject)));
		
		// We can auto-box 5 to Integer
		System.out.println("intObject.equals(5): "+intObject.equals(5));
		System.out.println("intObject.equals(longObject.intValue()): "+intObject.equals(longObject.intValue()));
		
		System.out.println("intPrimitive == shortPrimitive: "+(intPrimitive == shortPrimitive));
		System.out.println("shortPrimitive == intPrimitive: "+(shortPrimitive==intPrimitive));

	}
}
