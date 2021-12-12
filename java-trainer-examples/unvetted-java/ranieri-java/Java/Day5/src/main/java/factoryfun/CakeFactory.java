package factoryfun;

public class CakeFactory {

	
	public static Cake getCake(String caketype) {
		
		if(caketype == "Wedding Cake")
			return new WeddingCake();
		
		if(caketype == "Cup Cake")
			return new CupCake();
		
		else 
			return null;
		
		
	}
	
}
