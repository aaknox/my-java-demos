package advanced;

public class LambdaExample {

	public static void main(String[] args) {
		firstWay();
		secondWay();
	}

	public static void firstWay() {
		MyFunctionalInterface mfi = new MyFunctionalInterface() {
			@Override
			public void printSomething() {
				System.out.println("done, but syntax is verbose");
			}
		};
		mfi.printSomething();
	}
	
	public static void secondWay() {
		MyFunctionalInterface mfi = () -> {System.out.println("much better!");};
		mfi.printSomething();
	}

}
