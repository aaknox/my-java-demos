package com.revature.beans;

public class Shadow {
	public int a = 40;
	public int getA() {
		return this.a;
	}
	public static void method() {
		System.out.println("Shadow");
	}
	
	public static void main(String[] args) {
		Shadow s = new Shadow2();
		Shadow2 s2 = (Shadow2) s;
		
		System.out.println("s.a = "+s.a);
		System.out.println("s.getA()="+s.getA());
		System.out.println("s2.a = "+s2.a);
		System.out.println("s2.getA()="+s2.getA());
		Shadow.method(); //s.method();
		Shadow2.method(); //s2.method();
	}
}

class Shadow2 extends Shadow {
	public int a = 30;
	public int getA() {
		return this.a;
	}
	public static void method() {
		System.out.println("Shadow 2");
	}
}
