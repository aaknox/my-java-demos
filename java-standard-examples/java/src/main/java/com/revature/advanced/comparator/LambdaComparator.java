/**
 * @author Peter Alagna
 */

package com.revature.advanced.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.revature.advanced.Associate;

public class LambdaComparator {
	
	//Runnable Implementation
	public void lambdaRunnable(String message) {
		new Thread(() -> { System.out.println("Thread message: " + message); }).start();
	}
	
	//Comparator Implementation
	public Set<Associate> lambdaComparator(List<Associate> unsortedList) {
		Set<Associate> sortedList = new TreeSet<>(
				(Associate a1, Associate a2) -> { return a1.getFirstName().compareTo(a2.getFirstName()); }
				);
		sortedList.addAll(unsortedList);
		return sortedList;
	}

	//Comparator Implementation using a reference variable storing the implementation
	public Set<Associate> lambdaComparatorWithStoredVariable(List<Associate> unsortedList) {
		Comparator<Associate> c = (Associate a1, Associate a2) -> { return a1.getFirstName().compareTo(a2.getFirstName());};
		Set<Associate> sortedList = new TreeSet<>(c);
		sortedList.addAll(unsortedList);
		return sortedList;
	}
	
	public static void main(String[] args) {
		LambdaComparator lambda = new LambdaComparator();
		
		/** Runnable **/
		lambda.lambdaRunnable("First thread");
		lambda.lambdaRunnable("Second thread");
		
		/** Comparator **/
		List<Associate> unsortedList = new ArrayList<>();
		unsortedList.add(new Associate(1,"Juan","Lopez"));
		unsortedList.add(new Associate(2,"Ariel","Gomez"));
		unsortedList.add(new Associate(3,"Peter","Alagna"));
		unsortedList.add(new Associate(4,"Bobbert","Lesley"));
		System.out.println(lambda.lambdaComparator(unsortedList));
	}
}
