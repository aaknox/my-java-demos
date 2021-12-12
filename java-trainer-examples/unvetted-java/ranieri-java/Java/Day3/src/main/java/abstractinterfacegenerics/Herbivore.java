package abstractinterfacegenerics;

public interface Herbivore {
	
	public void digestPlant();
	
	default public void munchGrass() {
		System.out.println("Munch on some grass");
	}

}
