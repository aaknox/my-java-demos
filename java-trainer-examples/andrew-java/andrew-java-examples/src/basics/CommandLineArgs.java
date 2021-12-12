package basics;

public class CommandLineArgs {
	/*
	 * @author Andrew Crenwelge
	 */
	
	/*
	 * Use run configurations to pass in command line arguments.
	 * This class shows how commands are passed to the JVM and can be used in your program.
	 */

	public static void main(String[] args) {
		// all arguments passed to JVM in command line are stored as strings in args
		for (int i=0;i<args.length;i++) {
			String s = args[i]; // get the string out of the array
			System.out.println(s);
		}
	}

}
