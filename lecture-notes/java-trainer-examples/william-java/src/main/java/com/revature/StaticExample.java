package com.revature;

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
	
	public void increment() {
		this.myInstanceInt++;
		myStaticInt++;
	}
	
	public int getMyInstanceInt() {
		return this.myInstanceInt;
	}
	
	public int getMyStaticInt() {
		return myStaticInt;
	}

}
