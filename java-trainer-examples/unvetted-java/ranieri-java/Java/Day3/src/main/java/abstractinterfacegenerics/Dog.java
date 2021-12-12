package abstractinterfacegenerics;

public class Dog extends Animal implements Carnivore, Likeable{
	
	public void eat() {
		System.out.println("Scarf down food");
	}

	@Override
	public String toString() {
		return "Woof Bark'n arf";
	}
	
	public void fetch() {
		System.out.println("Fetches a stick");
	}

	public void digestMeat() {
		System.out.println("Digests meat really fast");
		
	}
	
	
	

}
