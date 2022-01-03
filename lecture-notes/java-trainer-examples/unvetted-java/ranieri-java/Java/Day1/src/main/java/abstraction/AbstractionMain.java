package abstraction;

public class AbstractionMain {
	
	
	public static void main(String [] args) {
		
		Politician martin = new Politician("Moral Martin");
		
		System.out.println(martin);
		martin.makeTrouble();
		System.out.println(martin);
		
		
		MobBoss.takeCareOfit(martin);
		System.out.println(martin);
		
	}
	

	

	

}
