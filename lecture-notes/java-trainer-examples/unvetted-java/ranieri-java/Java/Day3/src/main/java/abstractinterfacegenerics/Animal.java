package abstractinterfacegenerics;

abstract public class Animal {

	int age = 1;
	
	static String describe = "I am a living thing";
	
	abstract public void eat() ;
	
	public static void description() {
		System.out.println("Its a Living thing");
	}

	@Override
	public String toString() {
		return "I am an Animal";
	}
	

	
}
