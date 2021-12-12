package scoping;

public class Box {
	
	static int static_value = 100; // class or static scope shared by all instances. Hippie variable 
	int value ;  // instance scope

	public static void main(String[] args) {
		
		Box a = new Box();	
		a.value = 100;
		a.static_value = 1000;
		
		System.out.println("a has a value of "+ a.value);
		System.out.println("a has a static value of "+ a.static_value);

		
		Box b = new Box();	
		b.value = 500;
		b.static_value = 5;
		
		
		System.out.println("b has a value of "+ b.value);
		System.out.println("b has a static value of "+ b.value);
		
		System.out.println("a has a static value of "+ a.static_value);
		System.out.println("Box the class has a static value of "+ Box.static_value);
		
		
		
		
		for(int i = 0; i<10; i++ ) {
			System.out.println("Inside block scope");
			// variables declared in a block cannot leave the block.
			
			int blocko = 100;
		}
//		System.out.println(blocko); // variable not found
		
		
		
	}
	
	
	public void count(int y) {
		System.out.println("Inside a method scope");
		// variables declared in the scope cannot leave. 
		// The only way for variables to come into this scope is to be passed in by a parameter
		System.out.println(y);
		
	}

}
