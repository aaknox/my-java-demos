package basics;

public class VariableScopes {

	public static void main(String[] args) {
		// all the variables can be accessed in its own class
		System.out.println(new VariableScopes().availableEverywhere);
		System.out.println(new VariableScopes().inPackageAndSubClasses);
		System.out.println(new VariableScopes().onlyInPackage);
		System.out.println(new VariableScopes().onlyInThisClass);
		// method scope variable
		int method = 1;
		for (int i=method;i<5;i++) {
			// i is block-scoped variable
			System.out.println(i);
		}
	}
	
	// access modifiers
	public String availableEverywhere;
	protected String inPackageAndSubClasses;
	String onlyInPackage;
	private String onlyInThisClass;
	
	// static or class scope
	public static String belongsToClass;
	// object scope
	public String newStringForEachObj;
	
	public VariableScopes() {
		this.availableEverywhere = "hello1";
		this.inPackageAndSubClasses = "hello2";
		this.onlyInPackage = "hello3";
		this.onlyInThisClass = "hello4";
	}
}
