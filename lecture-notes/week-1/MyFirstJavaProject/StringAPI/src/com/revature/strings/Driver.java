package com.revature.strings;

public class Driver {

	/**
	 * Topic: Strings & Arrays
	 * - So what is a string?
	 * 	- A **string** is an array of characters.
	 * 	- An **array** is a sequence of elements of a similar datatype (will talk more about this later). All elements in an array start at index 0, 1, 2, etc.
	 * 	- In Java, strings & arrays are immutable objects. 
	 * 	- Immutable meaning that it cannot be changed once it's created.
	 * 	- Cannot be resized once instantiated.
	 * [END OF NOTE]
	 **/
	
	 /**
	 * Topic: String API
	 * - So why is the String API called as such?
	 * 	- API = application programming interface
	 * 	- In this case, the String API consist of built-in methods that helps to develop a program.
	 * 	- There will be some helpful methods that we can use to develop some interesting string manipulation.
	 * 
	 * [END OF NOTE]
	 **/
	public static void main(String[] args) {
		// DEMO: Let's make our first strings
		String s = "My name is Azhya. ";
		String t = new String("Welcome to Revature!");
		
		//DEMO: So how can we put these two sentences together?
		//This is the equivalent of doing: System.out.println(s + t);
		//System.out.println(s.concat(t));
		
		//DEMO: Now how do I just show my name only?
		//DEMO: Let's think about this using pseudocode:
		//**Note: This technique is useful whenever you are doing coding exercises for interviews.
		//DEMO: Now let's code out our plan.
		//1. Find out how big our string is.
		//int size = s.length();
		//System.out.println("The size of my string is: " + size);
		
		//2. Find out at what point my name first shows up & where my name ends
		//System.out.println("My name starts at index: " + s.indexOf('A'));
		//Now we know that there are 5 letters in my name. So end point is at index 16
		
		//3. Display that segment of the string
		//String name = s.substring(11, 16);
		//System.out.println("Name: " + name); //it works!
		
		//DEMO: Now I want to change the name from Azhya to Bob. What can we do here?
		//DEMO: Let's use a for-each loop to iterate through our string and then change the name!
		
		/**
		 * Topic: Foreach loop
		 * 
		 * 
		 * [END OF NOTE]
		 **/
		//1. Split the string up into a char array
		String[] words = s.split(" ");
		//DEMO: Let's use this loop to iterate through our array
		//words[3] = words[3].replace(".", "");
		for(String w: words) {
			System.out.println(w);
		}
		//DEMO: Now let's print my name again!
		//DEMO: Huh...so the period stayed. That's because we didn't have access to the index when using the foreach loop. Let's fix that.
		words[3] = words[3].replace(".", "");
		//System.out.println(words[3]); //now it works!
		
		/**
		 * Topic: Varargs
		 * 	- Variable Arguments (Varargs) = a method that takes a variable number of arguments
		 * 	- Simplifies the creation of methods that need to take a variable number of arguments
		 * 	- Keeps your code very flexible to demand
		 * 	- In our example, our vararg is a fluid int array.
		 * [END OF NOTE]
		 **/
		//DEMO: To demonstrate the power of varargs, we will make a simple add method.
		//int[] nums = {1, 2, 3, 4, 5};
		//This is an example of string interpolation. 
		//System.out.println(String.format("The sum of the numbers array is: %d", add(nums)));
		
		//DEMO: Let's use our fancyString method
		System.out.println(fancyString(words[3]));
	}
	
	//DEMO: No matter how big I make the nums array, this method will still work. No refactoring needed!
	public static int add(int...num) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		return sum;
	}
	
	/**
	 * Topic: StringBuilder & StringBuffer
	 * - StringBuilder, StringBuffer extend from Object Class (the parent class of all classes/objects in Java).
	 *  - Let's look at this comparison chart (String vs StringBuilder vs StringBuffer):
	 *	                STRING          STRINGBUFFER       STRINGBUILDER
	 *	----------------------------------------------------------------------
	 * 	Storage      |   String Pool     Heap                Heap
	 * 	Modifiable   |   Immutable   	Mutable           	Mutable
	 *	Thread Safe  |   YES             YES                 NO
	 *	Performance  |   FAST            VERY SLOW           FAST
	 * 
	 * - StringBuilder, StringBuffer has access to some Object class methods like equals(), clone(), and toString(), for example.
	 * [END OF NOTE]
	 **/
	public static String fancyString(String s) {
		StringBuilder build = new StringBuilder(s);
		return build.append("-string").toString();
	}
	

}
