package collectionsfun;

import java.util.ArrayList;
import java.util.Iterator;

public class ExIterator {
	
	
	
	public static void main(String [] args) {
		
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
		
		
//		System.out.println(people);
		
		Iterator<Person> iter = people.iterator();
		
//		while(iter.hasNext()) {
//			
//			Person p =  iter.next();
//			System.out.println(p.name);
//					
//		}
//			
		for(Person p : people) {
			
			p.hello();
//			System.out.println(p.height);
//			System.out.println(p.age);			
//			System.out.println(p.name);
		}
		
		
		
	}
	
	
	

	
	

}
