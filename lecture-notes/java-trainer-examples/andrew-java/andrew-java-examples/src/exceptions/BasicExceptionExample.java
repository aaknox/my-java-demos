package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BasicExceptionExample {

	public static void main(String[] args) {
		try { // try/catch blocks allow you to try out risky code and handle any exceptions that are thrown
			throwManyExceptions(3);
		} catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException caught");
		} catch (IOException e) {
			System.out.println("IOException caught");
		} catch (Exception e) { // if you have multiple catch blocks, broader exception classes must come after more specific ones
			System.out.println("Other exception caught");
		} finally {
			System.out.println("The finally block will always run! (unless System.exit(0) is called or power is lost)");
		}
	}
	
	public static void throwManyExceptions(int i)
			throws Exception { // throws declaration in the method signature means you are "ducking" the exception
		switch(i) {
		case 1: throw new IOException();
		case 2: throw new ClassNotFoundException();
		case 3: throw new FileNotFoundException();
		default: throw new Exception();
		}
	}

}
