package garbage;

public class Library {

	
	public static void main(String[] args) {
		
		
		Book wuthering = new Book("Wuthering Heights", 200);
		
		System.out.println(wuthering);
		// There is no way to reach the object pointed to by wuthering with Java
		wuthering = null;
		
		while(true) {
			// this only requests garbage collection
			// Java will do it at its own time. 
			System.gc();
		}
		
		
	}
	
	
}
