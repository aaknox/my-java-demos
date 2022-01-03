package com.revature.staticimports;

import static com.revature.staticimports.MyStaticImportExample.*;
import static java.lang.System.*;

public class Application {

	public static void main(String[] args) {
//		System.out.println(MyStaticImportExample.exampleString);
//		MyStaticImportExample.goodMorning("William");
//		System.out.println(MyStaticImportExample.whatIsPI());
		
		out.println(exampleString);
		out.println(whatIsPI());
		goodMorning("William");
	}
}
