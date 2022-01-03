package lambdas;

public class Calculator {

	public static void main(String[] args) {
		
		
		Calcuable add = ( x, y) -> { return (x+y); };
		
		Calcuable sub = (x,y) -> {return (x-y);};
		
		Calcuable multiply = (x,y) -> {return (x*y);};
		
		Calcuable divide = (x,y) -> {return (x/y);};
		
		
		System.out.println("add " + add.calculate(900, 76.645) );
		System.out.println("add " + multiply.calculate(900, 76.645) );
		
		

	}

}
