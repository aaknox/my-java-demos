package collectionsfun;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	
	
	String name;
	int height;
	int age;
	
	
	public Person(String name, int height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", height=" + height + ", age=" + age + "]";
	}
	
	
	
	public void hello() {
		System.out.println(" Hello ");
	}


	public int compareTo(Person p1) {
		
		if(this.height<p1.height)
			return -1;
		
		else if(this.height>p1.height)
			return 1;
		
		else
			return 0;

	}
	

	
	public static Comparator<Person> AgeComparator = new Comparator<Person>() {

		public int compare(Person p1, Person p2) {
						
			if(p1.age<p2.age)
				return -1;
			
			else if(p1.age>p2.age)
				return 1;
			
			else
				return 0;
			
		}
		
	};
	
	
}
