package garbage;

public class Book {
	
	String name;
	int pages;
	
	
	public Book(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}
	
	@Override
	public void finalize() {
		
		System.out.println("The book has been removed because no one knows it exists");
		
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + "]";
	}
	
	

	
	
}
