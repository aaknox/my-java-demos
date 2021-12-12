package exceptions;

public class CustomExceptionExample {

	public static void main(String[] args) {
		try {
			throwMyException();
		} catch (CustomException e) {
			System.out.println("I caught my own exception!");
		}
	}
	
	public static void throwMyException() throws CustomException {
		throw new CustomException();
	}

}
