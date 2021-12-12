package collectionsfun;

import java.util.ArrayList;
import java.util.Collections;

public class ExSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> sray = new ArrayList<String>();
//		
//		sray.add("Tim");
//		sray.add("Mike");
//		sray.add("Bob");
//		sray.add("Janet");
//		sray.add("Jill");
//		
//		System.out.println(sray);
//		
//		Collections.sort(sray);
//		System.out.println(sray);
		
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		Person adam = new Person("Adam", 72, 19);
		Person bob = new Person("Bob", 82, 35);
		Person carl = new Person("Carl", 62, 40);
		Person darryl = new Person("Darryl", 70, 29);
		Person eliza = new Person("Eliza", 66, 18);
				
		people.add(adam);
		people.add(bob);
		people.add(carl);
		people.add(darryl);
		people.add(eliza);
		
//		System.out.println("unsorted");
//		System.out.println(people);
//		
//		Collections.sort(people);
//		System.out.println("sorted");
//		System.out.println(people);
		
		Collections.sort(people, Person.AgeComparator);
		System.out.println(people);
		
		
		

	}

}
