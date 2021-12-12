/**
 * @author Richard Orr
 */


package com.revature.reflections.intro;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// Grab the Frankenstein class
		Class<Frankenstein> frankClass = Frankenstein.class;
		System.out.println(frankClass.getName());
		
		// Create a new Frankenstein instance
		Frankenstein frankObject = new Frankenstein();
		System.out.println(frankObject);
		// set the age
		frankObject.setAge(50);
		// set the name
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
		// getConstructors will get the constructors of the class, we'll print them with an enhanced for loop
		Constructor<Frankenstein>[] constructors = (Constructor<Frankenstein>[]) frankClass.getConstructors();
		for(Constructor<Frankenstein> c: constructors) {
			System.out.println("\t\t"+c);
		}
		
		System.out.println("\tFields");
		// get all fields declared within the Frankenstein class
		Field[] fields = frankClass.getDeclaredFields();
		for(Field f : fields) {
			System.out.println("\t\t"+f);
		}
		
		System.out.println(frankObject);
		// get the field by its name from the Frankenstein instance
		Field nameField = frankObject.getClass().getDeclaredField("name");
		// set the fields accessibility and its value
		nameField.setAccessible(true);
		nameField.set(frankObject, "ted");
		System.out.println(frankObject);
		
		// now mess with strings
		String s = "Hello";
		// get the fields from the String instance and print them all
		Field[] stringFields = s.getClass().getDeclaredFields();
		for(Field f : stringFields) {
			System.out.println(f);
		}
		// get the private field called value
		Field valueField = s.getClass().getDeclaredField("value");
		// get the modifiers from the field and change them
		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(valueField, valueField.getModifiers() & ~Modifier.FINAL);
		valueField.setAccessible(true);
		// change the previously private, value field to something different
		char[] c = { 'G', 'o', 'o', 'd', 'b', 'y', 'e'};
		valueField.set(s, c);
		
		String s2 = "Hello";
		System.out.println("line 84: s = " + s);
		System.out.println("line 85: s2 = "+s2);
		
		// using StringBuilder
		StringBuilder sb = new StringBuilder("Hel");
		// mutate the instance's value
		sb.append("lo");
		System.out.println("line 91: sb = " + sb);
		// convert the StringBuilder into a String
		String s4 = sb.toString();
		System.out.println("line 94: s4 = " + s4);
		// internalize the string s4
		s4 = s4.intern();
		System.out.println("line 97: s4 = "+ s4);
		String s3 = new String("Hel"+"lo");
		System.out.println("line 99: s3 = " + s3);
		// internalize the string s3
		s3 = s3.intern();
		System.out.println("line 101: s3 = "+s3);
		
		// lets see if s3 and s4 pass equality checks
		//	false
		System.out.println(s4.equals(s3));
		//	false
		System.out.println(s4==s3);
		//	false
		System.out.println(s3=="Hello");
		//	true
		System.out.println(s3.equals("Hello"));
	}
}
