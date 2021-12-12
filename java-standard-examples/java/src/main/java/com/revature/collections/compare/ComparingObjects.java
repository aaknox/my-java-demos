/**
 * @author Richard
 */

package com.revature.collections.compare;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparingObjects {
	public static void main(String[] args) {
		Set<Bean> beanTree = new TreeSet<Bean>();
		beanTree.add(new Bean("pinto", "tan", 10, .5f));
		beanTree.add(new Bean("pinto", "tan", 5, .2f));
		beanTree.add(new Bean("pinto", "tan", 4, .4f));
		beanTree.add(new Bean("black-eye", "brown", 10, .5f));
		beanTree.add(new Bean("pinto", "tan", 4, 3f));
		System.out.println(beanTree);
		
		Set<Bean> beanTree2 = new TreeSet<Bean>(new BeanYieldComparator());
		beanTree2.addAll(beanTree);
		System.out.println(beanTree2);
		
		Comparator<Bean> c = (Bean one, Bean two) -> {
			if(one.getMass() == two.getMass()) {
				return one.compareTo(two);
			}
			return (one.getMass()-two.getMass()<0) ? -1 : (one.getMass()-two.getMass()) > 0 ? 1 : 0;
		};
		
		Set<Bean> beanTree3 = new TreeSet<Bean>(c);
		beanTree3.addAll(beanTree);
		System.out.println(beanTree3);
	}
}
