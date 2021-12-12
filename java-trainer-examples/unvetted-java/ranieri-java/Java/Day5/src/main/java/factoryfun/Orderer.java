package factoryfun;

public class Orderer {
	
	
	public static void main(String[] args) {
		
		Cake a = CakeFactory.getCake("Cup Cake");
		Cake b = CakeFactory.getCake("Wedding Cake");
		
		a.serve();
		b.serve();
		
	}

}
