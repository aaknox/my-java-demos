package abstraction;

public class Politician {
	
	String name;
	boolean troubleMaker;
	
	
	Politician(String name){
		
		this.name = name;
		
	}
	
	public void makeTrouble() {
		this.troubleMaker = true;
		System.out.println(name + " is starting to cause trouble for the family");
	}

	@Override
	public String toString() {
		return "Politician [name=" + name + ", troubleMaker=" + troubleMaker + "]";
	}
	
	

}
