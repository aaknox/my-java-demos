package com.revature.otherjava;

import java.util.Scanner;

public class Driver {

	//DEMO: To use our menu, let's make a static reference of it above our main
	public static Menu menu = new MenuImpl();
	
	public static void main(String[] args) {
		// DEMO: Now let's use our interface to make a basic GUI
		// DEMO: First we will make a scanner object to read our user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your id number: ");
		int idNum = scan.nextInt();
		
		//DEMO: Now we will respond to the user using the welcome message
		System.out.println(menu.welcomeMessage(idNum));
		
		//DEMO: Now let's load in our menu
		System.out.println(menu.mainMenu());
		System.out.print("Your selection: ");
		int selection = scan.nextInt();
		while(selection != 0) {
			switch (selection) {
			case 1:
				System.out.println("Your id as a double value: " + menu.convertToDouble(idNum));
				break;
			case 2:
				System.out.println("Your id as a double value: " + menu.convertToInt((double)idNum));
				break;
			case 3:
				System.out.println("Calculating...\n");
				boolean is100 = menu.convertToObject(idNum);
				if(is100) {
					System.out.println("Your id number equals 100!");
				}else {
					System.out.println("Sorry, but your id number does NOT equal 100.");
				}
				break;
			default:
				throw new IllegalArgumentException("Invalid choice of: " + selection);
			}
			
			//DEMO: Let's make sure we reprompt the user for their next selection
			//Otherwise, we will have an infinite loop (which is VERY bad)!
			System.out.println(menu.mainMenu());
			System.out.print("Your selection: ");
			selection = scan.nextInt();
		}
		
		//DEMO: Once the user selects option 4, let's give them a goodbye message
		System.out.println("Thank you for using my application! Goodbye!!");
	}
	
}