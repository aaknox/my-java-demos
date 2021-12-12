package abstractinterfacegenerics;

public class Human extends Animal implements Carnivore , Herbivore, Likeable{
	
	public void eat() {
		System.out.println("Eats with a fork and plate");
	}

	public void philosophize() {
		System.out.println("Think deeply");
	}

	@Override
	public String toString() {
		return "I am Human";
	}

	public void digestPlant() {
		System.out.println("Digest plant decently");
		
	}

	public void digestMeat() {
	System.out.println("Digest meat slowly");
		
	}
	
}
