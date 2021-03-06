package com.revature.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class ListExample {
	public static void main(String[] args) {
		//arrayListExample();
		linkedListExample();
	}

	private static void linkedListExample() {
		LinkedList<Integer> link = new LinkedList<Integer>(); //All the functionality of a LinkedList
		List<Integer> list = (List<Integer>) link; //Only list functionality is accessible from this reference
		Deque<Integer> deque = (Deque<Integer>) link; // Deque
		Queue<Integer> queue = (Queue<Integer>) link; // Queue
		Collection<Integer> coll = (Collection<Integer>) link;
		Iterable<Integer> iterable = (Iterable<Integer>) link;
		
		
		// Queue
		System.out.println("Queue example");
		System.out.println("Queue" + queue);
		queue.add(7);
		System.out.println("Queue" + queue);
		queue.add(8);
		System.out.println("Queue" + queue);
		queue.add(5);
		System.out.println("Queue" + queue);
		System.out.println("Element: "+queue.element());
		System.out.println("Queue" + queue);
		System.out.println("Remove: "+queue.remove());
		System.out.println("Queue" + queue);
		System.out.println("Element: "+queue.element());
		System.out.println("Queue" + queue);
		System.out.println("Remove: "+queue.remove());
		System.out.println("Queue" + queue);
		System.out.println("Element: "+queue.element());
		System.out.println("Queue" + queue);
		System.out.println("Remove: "+queue.remove());
		System.out.println("Queue" + queue);
		System.out.println("Element: "+queue.peek());
		System.out.println("Queue" + queue);
		System.out.println("Remove: "+queue.poll());
		System.out.println("Queue" + queue);
		
	}

	private static void arrayListExample() {
		List<Integer> list = new ArrayList<Integer>(10);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(11);
		list.add(6);
		
		System.out.println(list);
		System.out.println(list.remove(3));
		System.out.println(list);
		
		list.add(1, 600);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		//cannot modify collection while iterating over it.
		/*for(Integer i : list) {
			System.out.println(i);
			if(i == 600) {
				list.remove(new Integer(600));
			}
		}*/
		
		/*Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println(i);
			if(i == 600) {
				iterator.remove();
			}
		}
		System.out.println(list);*/
		
		for(ListIterator<Integer> listIterator = list.listIterator(list.size()); listIterator.hasPrevious();) {
			System.out.println(listIterator.previous());
		}
	}
}
