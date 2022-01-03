package advanced;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {

	public static void main(String[] args) {
		predicateExample();
		consumerExample();
	}
	
	public static void predicateExample() {
		// Predicate is a functional interface that returns a boolean
		Predicate<Integer> lessthanten = n -> (n < 10);
		Predicate<Integer> greaterthanten = n -> (n > 10);
		// use the .test() method to evaluate the predicate with the input given
		System.out.println("Testing: 5, 10, 20");
		System.out.println("Less than ten?");
		System.out.println("5 "+lessthanten.test(5));
		System.out.println("10 "+lessthanten.test(10));
		System.out.println("20 "+lessthanten.test(20));
		System.out.println("\nGreater than ten?");
		System.out.println("5 "+greaterthanten.test(5));
		System.out.println("10 "+greaterthanten.test(10));
		System.out.println("20 "+greaterthanten.test(20));
		System.out.println("\nLess than OR greater than 10");
		System.out.println("5 "+lessthanten.or(greaterthanten).test(5));
		System.out.println("10 "+lessthanten.or(greaterthanten).test(10));
		System.out.println("20 "+lessthanten.or(greaterthanten).test(20));
	}
	
	public static void consumerExample() {
		Predicate<Integer> oddNumber = n -> (n % 2 != 0);
		Predicate<Integer> evenNumber = n -> (n % 2 == 0);
		Integer[] numbers = {1, 5, 10, 2, 9, 400, 70, 89, 33, 67, 91};
		// we can use streams to do operations on the array of numbers above
		Stream<Integer> odds  = Arrays.stream(numbers).filter(oddNumber); // filter takes a Predicate as an argument
		Stream<Integer> evens = Arrays.stream(numbers).filter(evenNumber);
		
		// Consumer is a functional interface that takes a single input and doesn't return anything
		Consumer<Integer> printOut = (i) -> System.out.println(i);
		System.out.println();
		System.out.println("ODDS: ");
		odds.forEach(printOut); // we are performing the action for each element of the stream
		System.out.println();
		System.out.println("EVENS: ");
		evens.forEach(printOut);
	}
	
}
