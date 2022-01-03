/**
 * @author William Gentry
 */

package com.revature.javaBasics.constructors;

/*
 * If we don't declare ANY constructors, the compiler gives us the default no-arg constructor for free!
 */
public class A {

	private int myNumber;
	
	public A() {
		// here, the call to super() is implicit
		System.out.println("Printing from inside A's no-arg constructor");
	}
	
	public A(int number) {
		// super() refers to the parent class constructor, which in this case is just Object()
		super(); // if we don't put this here, the compiler does it for us automatically
		System.out.println("Inside the 1-arg constructor of A");
		this.myNumber = number;
	}
}
