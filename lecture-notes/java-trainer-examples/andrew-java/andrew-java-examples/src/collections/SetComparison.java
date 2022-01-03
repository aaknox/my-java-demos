package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {

	public static void main(String[] args) {
		Set<String> hash = new HashSet<>();
		hash.add("foo");
		hash.add("bar");
		hash.add("baz");
		Set<String> tree = new TreeSet<>(hash);
		System.out.println("Hash set:");
		for (String s : hash) {
			System.out.println(s);
		}
		System.out.println("Hash set does not guarantee iteration order");
		System.out.println("Tree set:");
		for (String s : tree) {
			System.out.println(s);
		}
		System.out.println("Notice how TreeSet iterates in lexical/alphabetical/natural order");
		Set<String> linked = new LinkedHashSet<>(hash);
		System.out.println("LinkedHashSet:");
		for (String s : linked) {
			System.out.println(s);
		}
		System.out.println("A LinkedHashSet will always have same iteration order");
	}
	
}
