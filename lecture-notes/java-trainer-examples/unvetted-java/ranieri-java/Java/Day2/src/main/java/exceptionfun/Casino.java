package exceptionfun;

public class Casino {

	
	public static void main(String[] args) {
		
		gambler();
		
	}
	
	public static void gambler() {
		
		System.out.println("Going to the casion to win big!");
		
		double luck = Math.random();
		
		try {
			System.out.println("This is how lucky we are " +luck);
			gamble(luck);

		} catch(LostShirt ls) {				
			System.out.println("Go to pawn shop and sell grandfather's civil war pocket watch");
			
		}	
		catch (LostMoney lm) {		
			System.out.println("cancel dinner reservation at fancy restaurant ");

		}
		finally{
			System.out.println("Go home to wife and say you were working late");
		}

		

	}
	
	public static void gamble(double luck) throws LostMoney, LostShirt {
		
		if(luck>.90) {
			System.out.println("Won money!!!!");
		}
		
		else if(luck>.50) {
			throw new LostMoney();
		}
		else {
			throw new LostShirt();
		}
		
		
	}
	
	
}
