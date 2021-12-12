package exceptionfun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(badMath(20));
		badFile();
		
		try {
			badFileSlacker();
		} catch (FileNotFoundException e) {
			System.out.println("I got to handle your excpetion now");
		}
		

		randomizer();
		
		
		
	}
	
	// This is one of two ways to handle exceptions
	public static int badMath(int x) {
		
		
		try {
			System.out.println("attempting to divide by 0");	
			int result = x/0;
			return result;
		}
		catch(ArithmeticException ae) {
			
			System.out.println("You cannot divide by zero I will instead give you 0 like you deserve");			
			return 0;
		}
	
		
	}
		
	// checked exceptions are operations that java is smart enough to realize can go wrong
	// It forces you to address these
	public static void badFile() {
		File stuff = new File("Sea:\\spaghetios\\uniorn.txt");
		System.out.println(stuff.exists());
		
		
		System.out.println("Attempting to read a file that does not exist");
		
		try {
			FileReader reader = new FileReader(stuff);
		} catch (FileNotFoundException e) {
			
			// code that I would use to say what should happen in this situation
			System.out.println("It was caught and here is a smiley =)");
		}
		
	}

	// throws keyword means I will not handle the exception whoever called me will handle it or pass it on
	public static void badFileSlacker() throws FileNotFoundException{

		File stuff = new File("Sea:\\spaghetios\\uniorn.txt");
		System.out.println(stuff.exists());
		
		
		System.out.println("Attempting to read a file that does not exist");	
		System.out.println("I aint dealing with any problems. Its whoever called me problem ");

			FileReader reader = new FileReader(stuff);
		
		
	}

	public static void randomizer() {
		
		int rand = (int) (Math.random() *3);
		
		System.out.println(rand);
		
		try {
			
			int result = 8/rand;
			System.out.println("didnt divide by 0");
			
		}catch(Exception e) {	
			System.out.println("Well it looks like we divided by 0. =( ");
		}
		
		finally{
			System.out.println("I will alawys execute regardless of what happens");
		}
		
		
	}

	public static void horribleMethod() {
		
		try {
			throw new FileNotFoundException();			
		} catch(FileNotFoundException fnfe) {
			System.out.println("We always want to catch the most specific first");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

