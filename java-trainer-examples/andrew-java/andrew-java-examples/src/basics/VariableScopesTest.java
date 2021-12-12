package basics;

public class VariableScopesTest {
	public static void main(String[] args) {
		// the private field is not visible here
		System.out.println(new VariableScopes().availableEverywhere);
		System.out.println(new VariableScopes().inPackageAndSubClasses);
		System.out.println(new VariableScopes().onlyInPackage);
//		System.out.println(new VariableScopes().onlyInThisClass);
	}
}
