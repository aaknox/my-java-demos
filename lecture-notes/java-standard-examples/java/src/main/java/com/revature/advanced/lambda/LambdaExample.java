/**
 * @author Andrew Crenwelge
 */
package com.revature.advanced.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		// using our own functional interface
		firstWay();
		secondWay();
		// using the built-in Consumer functional interface with the .forEach method
		forEachWithLambda();
	}

	public static void firstWay() {
		MyFunctionalInterface mfi = new MyFunctionalInterface() {
			@Override
			public void printSomething() {
				System.out.println("done, but syntax is verbose");
			}
		};
		mfi.printSomething();
	}
	
	public static void secondWay() {
		MyFunctionalInterface mfi = () -> {System.out.println("much better!");};
		mfi.printSomething();
	}
	
	public static void forEachWithLambda() {
		// create our list
		List<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		// list is an Iterable, so we can use a forEach loop 
		// with a lambda expression to perform some operation
		list.forEach((String s) -> {
			System.out.println(s);
		});
	}

}
