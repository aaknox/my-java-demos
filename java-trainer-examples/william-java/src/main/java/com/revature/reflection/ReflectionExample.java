package com.revature.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.time.LocalDateTime;

public class ReflectionExample {

	private String name;
	private int id;
	private LocalDateTime todaysTime;
	
	public ReflectionExample() {}
	
	public ReflectionExample(LocalDateTime todaysTime) {
		super();
		this.todaysTime = todaysTime;
	}

	public ReflectionExample(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public ReflectionExample(String name, int id, LocalDateTime todaysTime) {
		super();
		this.name = name;
		this.id = id;
		this.todaysTime = todaysTime;
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Runtime run = Runtime.getRuntime();
		ReflectionExample re = new ReflectionExample();
		System.out.println("Free memory: " + run.freeMemory());
		System.out.println("Max memory: " + run.maxMemory());
		System.out.println("Total memory: " + run.totalMemory());
		
		System.out.println("Class Name: " + re.getClass().getName());
		System.out.println("Simple Name: " + re.getClass().getSimpleName());
		System.out.println("Superclass: " + re.getClass().getSuperclass());
		for (Constructor<?> c : re.getClass().getConstructors()) {
			System.out.println(c);
		}
		
		System.out.println(re.getClass().getClassLoader().loadClass("java.util.function.Predicate"));
		
		Field[] fields = re.getClass().getDeclaredFields();
		
		for (Field f : fields) {
			System.out.println(f.getName());
		}
		
		int reflectionMods = re.getClass().getModifiers();
		System.out.println("Public? " + Modifier.isPublic(reflectionMods));
		System.out.println("Static? " + Modifier.isStatic(reflectionMods));
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getTodaysTime() {
		return todaysTime;
	}

	public void setTodaysTime(LocalDateTime todaysTime) {
		this.todaysTime = todaysTime;
	}
	
	
}
