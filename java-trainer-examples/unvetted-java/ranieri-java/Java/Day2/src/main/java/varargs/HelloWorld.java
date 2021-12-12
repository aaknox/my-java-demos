package varargs;

public class HelloWorld {
	
	
	public static void main(String... spaghetios) {
		
		int [] xray = {10,20,30,40};
		
		// old fashioned for loop
		for(int i = 0; i < xray.length ; i++) {
			System.out.println("Standard loop" + xray[i]);
		}
		
		// arrays are always of a fixed size
		// this must be initialized when created
		
		int y [] = new int [3];
		
		y[0] = 60;
		y[1] = 70;
		y[2] = 80;
		
		// enhanced for loop
		for(int k : y) {
			System.out.println("enhanced loop" + k);
		}
		

		sum(xray);
		sum2(xray);
	
	}
	
	// old fashioned way
	public static void sum(int ray []) {
		int sum = 0;
		
		for(int i =0 ;i <ray.length ; i++) {
			sum =sum + ray[i];
		}
		
		System.out.println("the sum is "+ sum);
		
	}
	
	// newer way with alternate syntax 
	// Exactly the same under the hood
	public static void sum2(int... ray ) {
		int sum = 0;
		
		for(int i : ray) {
			sum += i;
		}
		
		System.out.println("The sum is "+ sum);
		
	}
	

}

