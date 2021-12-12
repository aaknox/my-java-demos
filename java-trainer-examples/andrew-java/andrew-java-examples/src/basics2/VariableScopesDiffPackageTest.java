package basics2;

import basics.VariableScopes;

public class VariableScopesDiffPackageTest {
	public static void main(String[] args) {
		// only the public variable is visible here
		System.out.println(new VariableScopes().availableEverywhere);
//		System.out.println(new VariableScopes().inPackageAndSubClasses);
//		System.out.println(new VariableScopes().onlyInPackage);
//		System.out.println(new VariableScopes().onlyInThisClass);
	}
}
