package basics;

public class ControlStatements {

	/*
	 * This class shows some basic examples of control statements and how they are used.
	 */

	public static void main(String[] args) {
		howLongWillThisGo();
		System.out.println("====================");
		someForLoop();
		System.out.println("====================");
		switchStatement(1000);
	}

	public static void howLongWillThisGo() {
		/*
		 * A while loop will continue executing until the condition evaluated becomes
		 * false or the break keyword is used.
		 */
		while (true) {
			// block-scoped variable assigned from ternary operator
			boolean b = Math.random() > 0.75 ? true : false;
			if (b) break; // use break keyword to exit the loop
			System.out.println("keep going");
		}
		System.out.println("exited the loop");
		boolean c = false;
		do {
			// a do-while loop specifies the block with the do keyword and
			// condition evaluation comes after the block
			System.out.println("the do-while loop always executes at least once");
		} while(c); // loop exits here after 1 run through the block
	}

	public static void someForLoop() {
		String[] sarr = {"hello", "goodbye", "hello again"}; // an array of strings
		// using for loop to iterate over the array
		for (int i=0;i<sarr.length;i++) {
			// using if statement to check the contents of array at index i
			if (sarr[i]=="goodbye") continue; // use continue keyword skip the rest of the block
			System.out.println(sarr[i]); // print out the string at the current index
		}
	}

	public static void switchStatement(int number) {
		// a switch statement takes an int, String, char, byte, short, or enum
		switch(number) {
		// and matches the input to a specified case
		case 1: System.out.println("number is 1"); break; // the break ensures that the block is exited after this line
		case 2: System.out.println("number is 2"); break;
		// without the break the code would "fall through" to the next line
		case 1000: System.out.println("number is 1000"); break;
		// optionally, we can specify a default case which will execute if no other case is matched
		default: System.out.println("none of the above"); break;
		}
	}

}
