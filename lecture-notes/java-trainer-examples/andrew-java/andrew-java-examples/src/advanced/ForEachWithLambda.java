package advanced;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithLambda {

	public static void main(String[] args) {
		// create our list
		List<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		// use a forEach loop and a lambda expression to print out each value 
		list.forEach((String s) -> {
			System.out.println(s);
		});
	}

}
