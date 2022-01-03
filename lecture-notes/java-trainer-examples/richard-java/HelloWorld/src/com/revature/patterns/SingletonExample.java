package com.revature.patterns;

public class SingletonExample {
	private static SingletonExample ourInstance = null;

	private String myString;
	
	private SingletonExample() {
		super();
		myString = "Hello";
	}
	
	public static synchronized SingletonExample getInstance() {
		if(ourInstance==null) {
			ourInstance = new SingletonExample();
		}
		return ourInstance;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
}
