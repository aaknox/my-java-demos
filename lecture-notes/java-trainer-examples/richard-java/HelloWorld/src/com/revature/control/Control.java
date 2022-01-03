package com.revature.control;

import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		//control();
		//enhanced();
		//ternary();
		//shortCircuit();
		//breakControl();
		switchStatements();
	}

	private static void switchStatements() {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Input a value: ");
		int x = scan.nextInt();
		switch(x) {
		case 0: System.out.println("x was 0"); break;
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		default: System.out.println("x wasn't within bounds.");
		}
	}

	private static void breakControl() {
		// labels, break, continue
		/*for(int i =0; i< 10; i++) {
			System.out.println(i);
			if(i==5) {
				continue;
			}
			if(i==7)
				break; 
			System.out.println(i);
		}*/
		loop1: for (int i = 0; i< 10; i++) {
			loop2: for(int j = 0; j<10; j++) {
				if(i==7 && j > 3) {
					break loop1;
				}
				System.out.println(i+ " "+ j);
			}
		}
		
	}

	private static void shortCircuit() {
		int x = 6;
		int y = 6;
		int z = 7;
		System.out.println("x="+x+", y="+y+", z="+z);
		
		if(x++ == y | x == z++) {
			System.out.println("true");
		}
		
		System.out.println("x="+x+", y="+y+", z="+z);
	}

	private static void ternary() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a value: ");
		int x = scan.nextInt();
		
		String s = x>3 ? "x is greater than 3" : "x is not greater than 3";
		
		System.out.println(s);
	}

	private static void enhanced() {
		String[] arr = { "Horse", "Dog", "Bat", "Iguana", "Monkey", "Pizza" };
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("");
		for(String animal : arr)  {
			System.out.println(animal);
		}
	}

	private static void control() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a value: ");
		
		int x = scan.nextInt();
		
		
		// if statements
		if( x > 3 ) {
			System.out.println("x is greater than 3");
		} else {
			if(x == 3) {
				System.out.println("x is 3");
			} else {
				System.out.println("x is not greater than 3");
			}
		}
		
		// for loops
		for (int i = 0; i< x; i++) {
			System.out.println(i);
		}
		
		// While loops
		int i = 0;
		while(i<x) {
			System.out.println(i);
			i++;
		}
		
		// do while loop
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i < x);
	}
}
