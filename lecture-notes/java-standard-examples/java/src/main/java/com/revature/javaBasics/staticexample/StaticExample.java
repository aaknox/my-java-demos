package com.revature.javaBasics.staticexample;

public class StaticExample {
	
	/**
	 * @author William Gentry
	 * 
	 * The purpose of this example is to help with the initial understanding of static/non-static variables
	 * I used this class along with the associated unit tests to help illustrate the concept that static variables belongs to 
	 * the class and instance variables belong to individual instances
	 */

	private int myInstanceInt;
	public static int myStaticInt;
	
	//introduce how and why we can access a static variable inside of an
	//	instance method, but not the other way around.
	public void increment() {
		this.myInstanceInt++;
		myStaticInt++;
	}

		//explain why this does not work
	// public static void incrementStatic(){
	// 	myInstanceInt++;
	// 	myStaticInt++;
	// }
	
	public int getMyInstanceInt() {
		return this.myInstanceInt;
	}
	
	public static int getMyStaticInt() {
		return myStaticInt;
	}

}
