package com.revature.hello;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello World");
		
		System.out.println(Arrays.toString(args));
		
		
		HelloWorld h = new HelloWorld();
		HelloWorld f = new HelloWorld();
		
		
		//We can stack overflow with Recursion
		//h.main(args);
		
		System.out.println(h.message +" - "+f.message);
		h.message = "Tomorrow";
		System.out.println(h.message +" - "+f.message);
		HelloWorld d = new HelloWorld("Pizza");
		System.out.println(d.message);
	}
	
	private String message;
	
	public HelloWorld() {
		//super();
		//message = "Hello, Shirley.";
		
		this("Hello, Shirley.");
	}
	
	public HelloWorld(String message) {
		//implicit call to super()
		this.message=message;
	}
}
