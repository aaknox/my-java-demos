package com.revature.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.revature.beans.Frankenstein;

public class Reflection {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<Frankenstein> frankClass = Frankenstein.class;
		System.out.println(frankClass.getName());
		
		Frankenstein frankObject = new Frankenstein();
		System.out.println(frankObject);
		frankObject.setAge(50);
		frankObject.setName("Frankie");
		System.out.println(frankObject);
		
		System.out.println("\tDeclared Methods");
		// All methods declared in the class (public, protected, package, and private)
		// excludes inherited methods
		Method[] methods = frankClass.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println("\t\t" + m);
		}
		
		System.out.println("\tPublic Methods");
		// getMethods will get all public methods declared or inherited
		methods = frankClass.getMethods();
		for(Method m : methods) {
			System.out.println("\t\t" + m);
		}
		
		System.out.println("\tConstructors");
		Constructor<Frankenstein>[] constructors = (Constructor<Frankenstein>[]) frankClass.getConstructors();
		for(Constructor<Frankenstein> c: constructors) {
			System.out.println("\t\t"+c);
		}
		
		System.out.println("\tFields");
		Field[] fields = frankClass.getDeclaredFields();
		for(Field f : fields) {
			System.out.println("\t\t"+f);
		}
		
		System.out.println(frankObject);
		Field nameField = frankObject.getClass().getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(frankObject, "ted");
		System.out.println(frankObject);
		
		String s = "Hello";
		Field[] stringFields = s.getClass().getDeclaredFields();
		for(Field f : stringFields) {
			System.out.println(f);
		}
		Field valueField = s.getClass().getDeclaredField("value");
		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(valueField, valueField.getModifiers() & ~Modifier.FINAL);
		valueField.setAccessible(true);
		char[] c = { 'G', 'o', 'o', 'd', 'b', 'y', 'e'};
		valueField.set(s, c);
		
		String s2 = "Hello";
		System.out.println(s);
		System.out.println(s2);
		
		StringBuilder sb = new StringBuilder("Hel");
		sb.append("lo");
		System.out.println(sb);
		String s4 = sb.toString();
		System.out.println(s4);
		s4 = s4.intern();
		System.out.println(s4);
		String s3 = new String("Hel"+"lo");
		System.out.println(s3);
		s3 = s3.intern();
		System.out.println(s3);
		
		System.out.println(s4.equals(s3));
		System.out.println(s4==s3);
		System.out.println(s3=="Hello");
		System.out.println(s3.equals("Hello"));
	}
}
