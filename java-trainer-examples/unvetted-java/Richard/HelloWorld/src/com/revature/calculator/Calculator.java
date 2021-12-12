package com.revature.calculator;

public class Calculator <T extends Number>{
	public static void main(String[] args) {
		Calculator<Integer> intCalc = new Calculator<Integer>();
		System.out.println(intCalc.div(5, 0));
		Calculator<Double> doublCalc = new Calculator<Double>();
		System.out.println(doublCalc.div(5., 0.));
		System.out.println(intCalc.mult(5,  5,5,5,5));
	}
	public T add(T a, T b) {
		Number ret = null;
		ret = a.doubleValue() + b.doubleValue();
		
		if(!(a instanceof Double) && !(a instanceof Float)) {
			ret= Math.round(ret.doubleValue());
		}
		return (T) ret;
	}
	public T sub(T a, T b) {
		Number ret = null;
		ret = a.doubleValue() - b.doubleValue();
		
		if(!(a instanceof Double) && !(a instanceof Float)) {
			ret= Math.round(ret.doubleValue());
		}
		return (T) ret;
	}
	public T mult(T a, T b) {
		Number ret = null;
		ret = a.doubleValue() * b.doubleValue();
		
		if(!(a instanceof Double) && !(a instanceof Float)) {
			ret= Math.round(ret.doubleValue());
		}
		return (T) ret;
	}
	public T div(T a, T b) {
		Number ret = null;
		ret = a.doubleValue() / b.doubleValue();
		
		if(!(a instanceof Double) && !(a instanceof Float)) {
			ret= Math.round(ret.doubleValue());
		}
		return (T) ret;
	}
	
	public T add(T a, T... b) {
		T ret = a;
		for(T n: b) {
			ret = add(ret, n);
		}
		return ret;
	}
	public T sub(T a, T... b) {
		T ret = a;
		for(T n: b) {
			ret = sub(ret, n);
		}
		return ret;
	}
	public T mult(T a, T... b) {
		T ret = a;
		for(T n: b) {
			ret = mult(ret, n);
		}
		return ret;
	}
	public T div(T a, T... b) {
		T ret = a;
		for(T n: b) {
			ret = div(ret, n);
		}
		return ret;
	}
}
