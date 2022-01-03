package com.revature.calculator;

import org.apache.log4j.Logger;

public class Calculator <T extends Number>{
	
	private static Logger log = Logger.getLogger(Calculator.class);
	
	public static void main(String[] args) {
		log.trace("Hello");
		Calculator<Integer> intCalc = new Calculator<Integer>();
		log.trace(intCalc.div(5, 0));
		Calculator<Double> doublCalc = new Calculator<Double>();
		log.trace(doublCalc.div(5., 0.));
		log.trace(intCalc.mult(5,  5,5,5,5));
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
		//log.debug(a);
		
		//log.debug(b);
		
		if(!(a instanceof Double) && !(a instanceof Float)) {
			ret= Math.round(ret.doubleValue());
		}
		//log.warn("this is a warning.");
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
	public void test() {
		throw new IllegalArgumentException();
	}
}
