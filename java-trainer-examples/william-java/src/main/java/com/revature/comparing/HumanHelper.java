package com.revature.comparing;

import java.util.Comparator;

public class HumanHelper implements Comparator<Human> {

	@Override
	public int compare(Human o1, Human o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
