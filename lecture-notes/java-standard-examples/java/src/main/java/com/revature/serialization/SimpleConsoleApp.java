/**
 * @author Andrew Crenwelge
 */

package com.revature.serialization;

import java.util.Scanner;

public class SimpleConsoleApp {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		simpleMenu();
	}

	public static void simpleMenu() {
		System.out.println("Welcome to TheConsoleApp. Please choose an option");
		System.out.println("0 - exit");
		System.out.println("1 - echo input loop");
		System.out.println("2 - login");
		System.out.println("3 - CodeTrivia");
		int i = sc.nextInt();
		switch (i) {
		case 0:
			exit();
			break;
		case 1:
			simpleEchoInfiniteLoop();
			break;
		case 2:
			login();
			break;
		case 3:
			trivia();
			break;
		}
	}

	public static void simpleEchoInfiniteLoop() {
		System.out.println("Starting echo loop... enter 'exit' to go back to main menu");
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			if (s.equals("exit"))
				break;
			System.out.println(s);
		}
		System.out.println("Ending 'echo' loop");
		simpleMenu();
	}

	public static void login() {
		boolean flag = true;
		do {
			System.out.println("Please enter your username");
			String uname = sc.next();
			System.out.println("Please enter your password");
			String pword = sc.next();
			// important to use .equals method instead of == here
			if (uname.equals("steve.jobs@apple.com") && pword.equals("ilovetheiphone")) {
				System.out.println("Welcome, Steve! You successfully logged in.");
				flag = false;
			} else {
				System.out.println("Uname: " + uname + ", pw:" + pword);
				System.out.println("Incorrect credentials... try again");
				flag = true;
			}
		} while (flag);
		System.out.println("Returning to main menu");
		simpleMenu();
	}

	public static void trivia() {
		int points = 0;
		// put questions/answers in an array
		String[] questions = { "What is the keyword that prevents a class from being extended?",
				"What access modifier only allows access from within the same package?" };
		String[] answers = { "final", "default" };
		System.out.println("Welcome to CodeTrivia!");
		System.out.println("Let's get started with the first question:");
		for (int i = 0; i < questions.length; i++) {
			System.out.println("Q: " + questions[i]);
			if (i == 0) {
				sc.nextLine(); // must skip line of first question otherwise input is read improperly
			}
			String s = sc.nextLine();
			if (s.equalsIgnoreCase(answers[i])) {
				System.out.println("Yes! You earned a point. Your score is now " + (++points));
			} else {
				System.out.println("Sorry :( That's not right. Your score is " + points);
			}
		}
		System.out.println("That's all the questions. Thanks for playing! Your final score is " + points);
		System.out.println("Heading back to the main menu...");
		simpleMenu();
	}

	public static void exit() {
		System.out.println("Program terminated... goodbye");
		sc.close();
	}
}
