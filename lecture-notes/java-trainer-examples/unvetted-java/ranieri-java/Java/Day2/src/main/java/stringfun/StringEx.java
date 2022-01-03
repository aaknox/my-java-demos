package stringfun;

public class StringEx {
	
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s3 = "Hello";
		//The new allocates memory in the heap
		String s4 = new String("Hello");
		
		// the double equals checks the memory address
		// s1 == s3 is true beacuse of the string pool
		System.out.println(s1 == s3);
		System.out.println(s1 == s4 );
		
		// the the equals method checks the value of the string objects
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		//////////////////////////////////////////////////////////////////

		StringBuilder sb1 = new StringBuilder("awesome");
		StringBuilder sb2 = new StringBuilder("awesome");
		
		System.out.println(sb1 == sb2);
		
		
		//// immutability of string vs stringbuilder
		
		String ziti = "Ziti";
		
		System.out.println(ziti.concat(" my favortie pasta"));
		System.out.println(ziti);
		
		/// mutability of stringbuilder
		
		StringBuilder rigatoni = new StringBuilder("Rigatoni");
		
		System.out.println(rigatoni.append(" al dente"));
		System.out.println(rigatoni);
		
		
		
		
		
		
		
		System.out.println("String "+ stringDiff(1000));
		System.out.println("StringBuilder "+ builderDiff(1000));
		System.out.println("StringBuffer "+ bufferDiff(1000));
		
		
		
	}
	public static long stringDiff(int iterations) {
		String s = "";
		long start = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			s += "a";
		}
		long end = System.nanoTime();
		return end - start;
	}
	
	public static long builderDiff(int iterations) {
		StringBuilder sb = new StringBuilder();
		long start = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			sb.append("a");
		}
		long end = System.nanoTime();
		return end - start;
	}
	
	public static long bufferDiff(int iterations) {
		StringBuffer buff = new StringBuffer();
		long start = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			buff.append("a");
		}
		long end = System.nanoTime();
		return end - start;
	}
	

}
