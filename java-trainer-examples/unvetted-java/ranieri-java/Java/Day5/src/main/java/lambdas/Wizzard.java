package lambdas;

public class Wizzard {

	
	String name;
	Magic proficency;
	
	public Wizzard(String name, Magic element) {
		
		this.name = name;
		this.proficency = element;
		
	}
	public static void main(String[] args) {
		
		
		Magic fireball = () -> {System.out.println("fireball");};	
//		fireball.castSpell();
//		
		Wizzard fireWizzard = new Wizzard("Gandalf", fireball);		
//		fireWizzard.proficency.castSpell();
		
		Wizzard iceWizzard = new Wizzard("Sauron",()-> System.out.println("Icebeam") );
		
//		iceWizzard.proficency.castSpell();		
		fireWizzard.doMagic();
		

	

		
	}
	
	public void doMagic() {
		proficency.castSpell();
	}

	
	
	

}
