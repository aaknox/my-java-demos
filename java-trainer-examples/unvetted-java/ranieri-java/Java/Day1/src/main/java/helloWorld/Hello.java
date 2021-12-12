package helloWorld;

import java.util.Scanner;

// classes and interfaces should be capitalized 
public class Hello {

	// the main with a a string arguments array is the entry point of any java program
	public static void main(String... args) {

		// do not use dollar sign or underscore though it is possible
		System.out.println("Hello World");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		System.out.println("Hello world " + name);

	}
	
	// methods should be camel case
	public static void sayHello() {
		
		
	}

}
