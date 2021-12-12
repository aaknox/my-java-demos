package com.revature.javaBasics.reverseAString;

public class ReverseAString {
	
	/**
	 *
	 * @author William Gentry
	 * 
	 * I like to give this problem on the first day. Simple reverse a string algorithm, however they may only use {@link String#charAt(int)}
	 *
	 */

	/* This method will reverse a String only using charAt() */
	public static String reverse(String input) {
		String toBeReturned = "";
		int index = 0;
		while (true) {
			try {
				input.charAt(index);
				index++;
			} catch (IndexOutOfBoundsException e) {
				index--;
				for (int i = -1; index > i; index--) {
					toBeReturned += input.charAt(index);
				}
				break;
			}
		}
		return toBeReturned;
	}
}
