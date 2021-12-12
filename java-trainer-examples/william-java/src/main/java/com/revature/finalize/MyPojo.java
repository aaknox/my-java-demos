package com.revature.finalize;

public class MyPojo {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method has been invoked in the MyPojo instance " + this.toString());
	}

	public static void main(String[] args) {
		MyPojo myPojo = new MyPojo();
		myPojo = null;
		System.gc();
	}
}
