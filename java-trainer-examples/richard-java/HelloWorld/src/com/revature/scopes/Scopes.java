package com.revature.scopes;

public class Scopes {
	/* Scopes
	 * The lifetime of a variable
	 * 4 in Java
	 * 
	 * Class/Static = This is the largest scope. ("global")
	 * 		Variables in the class scope exist for the lifetime of the class and exist
	 * 		within the class itself.
	 * 
	 * Object/Instance = The object's fields/state
	 * 		Variables in this scope exist for the lifetime of the object and exist
	 * 		within the object itself.
	 * 
	 * Method = parameters and any variables defined at the method level
	 * 		Variables in this scope exist for the liftime of the method call.
	 * 
	 * Loop/Block scope = any variables defined within curly braces
	 */
	
	public Scopes() {
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Instance Block");
		i = 4;
		j = 4;
	}
	
	static {
		System.out.println("static block");
		i = 4;
		//j = 4;
	}
	
	public static int i;
	public int j;
	
	
	public static void main(/* method scope */String[] args) {
		System.out.println("Main method");
		
		// method scoe
		int k;
		
		// block scope
		for (int l = 0; l<3; l++)
		{
			i =5;
			//j = 4;
			k=5;
			l = 5;
		}
		
		// k lives, i lives
		i = 3;
		//j = 3;
		k = 3;
		//l = 3;
		
		Scopes s = new Scopes();
		s.method(k);
	}


	private void method(int hi) {
		// j lives, i lives
		i = 5;
		j = 5;
		//k = 5;
		//l = 5;
	}
}
