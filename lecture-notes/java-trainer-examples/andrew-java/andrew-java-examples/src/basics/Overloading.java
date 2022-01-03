package basics;

public class Overloading {
	
	/*
	 * This class provides examples of method overloading
	 */

	public static void main(String[] args) {
		new Overloading().overloadMe();
		new Overloading().overloadMe("some string");
		new Overloading().overloadMe("hello",45);
		new Overloading().overloadMe(10,"goodbye");
	}
	
	public void overloadMe() {
		System.out.println("no-arg method");
	}
	
	public void overloadMe(String s) {
		System.out.println("method with one arg: "+s);
	}
	
	public void overloadMe(String s, int i) {
		System.out.println("method with two args: "+s+", "+i);
	}
	
	public void overloadMe(int i, String s) {
		System.out.println("method with two args: "+i+", "+s);
	}

}
