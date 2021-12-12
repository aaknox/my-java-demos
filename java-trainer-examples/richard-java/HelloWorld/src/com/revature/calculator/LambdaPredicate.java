package com.revature.calculator;

import java.util.function.Predicate;

public class LambdaPredicate {
	public static void main(String[] args) {
		Calculator<Long> intCalc = new Calculator<Long>();
		Predicate<Calculator<Long>> p = (i) -> i.add(1l, 1l) == 2;
		System.out.println(p.test(intCalc));
		Predicate<Calculator<Long>> p2 = (i) -> {
			Long l = i.div(5l, 0l);
			return Long.MAX_VALUE == l;
		};
		System.out.println(p2.test(intCalc));
		
		p = p.and(p2);
		
		System.out.println(p.test(intCalc));
	}
}
