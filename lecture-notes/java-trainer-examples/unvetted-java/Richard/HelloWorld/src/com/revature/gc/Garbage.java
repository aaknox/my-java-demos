package com.revature.gc;

public class Garbage {
	private String name;
	private int order;

	public static void main(String[] args) {
		Garbage g;
		for (int i = 0; i < 5; i ++) {
			g = new Garbage("Troy", i);
			System.gc();
			//System.out.println(i);
		}
	}

	public Garbage(String name, int order) {
		super();
		this.name = name;
		this.order = order;
	}

	@Override
	public String toString() {
		return "Garbage [name=" + name + ", order=" + order + "]";
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println(this);
	}
}
