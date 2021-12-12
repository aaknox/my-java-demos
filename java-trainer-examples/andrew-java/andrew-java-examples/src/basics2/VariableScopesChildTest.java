package basics2;

import basics.VariableScopes;

public class VariableScopesChildTest extends VariableScopes {

	public static void main(String[] args) {
		// only the public & protected variables are visible here
		System.out.println(new VariableScopesChildTest().availableEverywhere);
		System.out.println(new VariableScopesChildTest().inPackageAndSubClasses);
//		System.out.println(new VariableScopesChildTest().onlyInPackage);
//		System.out.println(new VariableScopesChildTest().onlyInThisClass);
	}

}
