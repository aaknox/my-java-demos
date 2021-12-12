package com.revature.hello;

public class Method {
	public static void main(String[] args) {
		Method.method();
		Method.method("pizza");
		Method.method("pizza", 1);
		Method.method(1);
	}
	
	public static void method() {
		System.out.println("method() called");
	}
	public static void method(String hello) {
		System.out.println("method(String) called with argument "+hello+".");
	}
	public static void method(String hello, int i) {
		System.out.println("method(String, int) called with arguments "+hello+", "+i+".");
	}
	public static void method(int i) {
		System.out.println("method(int) called with argument "+i+".");
	}
}
