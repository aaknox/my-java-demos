package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachLoops {

	public static void main(String[] args) {
		// we can loop through an array using a for-each loop
		System.out.println("*Array iteration:*");
		String[] sarr = {"first","second","third"};
		for (String s : sarr) {
			System.out.println(s);
		}
		// we can do the same with lists or sets
		System.out.println("*List iteration:*");
		List<String> slist = new ArrayList<>();
		slist.add("first");
		slist.add("second");
		slist.add("third");
		slist.add("first");
		for (String s : slist) {
			System.out.println(s);
		}
		System.out.println("*Set iteration:*");
		Set<String> sset = new HashSet<>(slist); // create hashset from a list
		sset.add("fourth");
		sset.add("fifth");
		for (String s : sset) {
			System.out.println(s);
		}
		System.out.println("**notice how the hashset does not iterate in same order**");
		System.out.println("**also notice how the hashset discards the duplicated value**");
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "first");
		map.put(2, "second");
		map.put(3, "third");
		System.out.println("*Map iteration:*");
		for (String s : map.values()) {
			System.out.println(s);
		}
		System.out.println("**notice for maps, we must use map.values() to iterate over the values**");
	}

}
