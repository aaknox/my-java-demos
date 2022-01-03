package com.revature.collections.compare;

import java.util.Comparator;

public class BeanYieldComparator implements Comparator<Bean> {

	@Override
	public int compare(Bean b1, Bean b2) {
		if(b1.getYield() == b2.getYield())
			return b1.compareTo(b2);
		return b1.getYield() - b2.getYield();
	}

}
