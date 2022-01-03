package lambdas;

public class HelloWorldLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		HelloWorldLambda h = new HelloWorldLambda();
		
		
		
		Hello spanish = () -> System.out.println("Hola");
		Hello german = () -> System.out.println("Gutentag");
		german.sayHello();
		spanish.sayHello();

		
		
	}

	

}
