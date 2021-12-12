package com.revature.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Except {
	public static void main(String[] args) {
		//exceptionHierarchy();
		finallyExample();
		/*try {
			method1();
		} catch(FileNotFoundException e) {
			System.out.println("Oh no, we didn't find the file.");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Successfully ran main method.");
	}

	private static void finallyExample() {
		int[] arr = new int[4];
		try {
			System.out.println("Trying code.");
			arr[3]=5;
			System.out.println("This will print if the code suceeded.");
			return;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Caught an exception!");
			//return;
		} finally {
			System.out.println("This always runs.");
		}
		System.out.println("Can this be reached?");
	}

	public static void method1() throws Exception {
		System.out.println("Hi from method1");
		throw new FileNotFoundException("Too much pie. Am full now.");
	}
	
	public static void method2() throws TooMuchPieException {
		System.out.println("Hi from method2");
		throw new TooMuchPieException();
	}
	
	public static void method3() {
		System.out.println("Hi from method3");
		throw new RuntimeException("You done messed up.");
	}
	private static void exceptionHierarchy() {
		try {
			throw new TooMuchPieException();
		} catch (TooMuchPieException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
