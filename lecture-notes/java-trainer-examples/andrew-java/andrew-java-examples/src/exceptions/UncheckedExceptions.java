package exceptions;

public class UncheckedExceptions {

	public static void main(String[] args) {
		int i = doBadMath(0);
		System.out.println(i);
		throwUncheckedException();
	}
	
	public static void throwUncheckedException() {
		throw new ArithmeticException(); // unchecked exceptions do not need to be declared or caught/handled
	}
	
	public static int doBadMath(int j) {
		try {
			return 5 / j;
		} catch (ArithmeticException ae) {
			System.out.println("Invalid input - can't divide by zero!");
		}
		return 0; // provide fallback value here
	}

}
