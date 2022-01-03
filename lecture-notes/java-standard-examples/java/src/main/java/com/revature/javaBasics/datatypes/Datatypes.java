/**
 * @author Yuvi
 */

package com.revature.javaBasics.datatypes;

public class Datatypes {

	//instance and static variables get default values.
	int i; //32 bits
	char c; //16 bits
	double d; //64 bits
	float f; //32 bits
	long l; //64 bits
	short s; //16 bits
	byte b; //8 bits
	boolean bo; //represents 1 bit, but is jvm specific
	Object o; //depends on the object
	
	public static void main(String[] args) {
		new Datatypes().print();
		int methodScope;//method scope variables do not get default values
		if(true){
			boolean blockScope;//block scope does not get default values
		}
		int[] arrAnyScope = new int[3];//arrays get default values no matter the scope, but only when instantiated
	}
	
	void print() {
		System.out.println("i : " + i);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("l : " + l);
		System.out.println("s : " + s);
		System.out.println("b : " + b);
		System.out.println("bo : " + bo);
		System.out.println("o: " + o);
	}

}
