package com.revature.patterns;

public class Driver {
	public static void main(String[] args) {
		//singleton();
		factory();
	}

	private static void factory() {
		FactoryExample factory = new FactoryExample();
		factory.getCheesable().spreadCheese();
	}

	private static void singleton() {
		//With a private constructor, no other class can make instances
		//SingletonExample s = new SingletonExample();
		
		SingletonExample s = SingletonExample.getInstance();
		SingletonExample s2 = SingletonExample.getInstance();
		
		// 2 references to the same object
		System.out.println(s == s2);
		System.out.println(s.getMyString());
		System.out.println(s2.getMyString());
		
		s.setMyString("Cheese");
		
		System.out.println(s.getMyString());
		System.out.println(s2.getMyString());
	}
}
