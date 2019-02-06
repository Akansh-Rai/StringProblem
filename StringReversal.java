/**
 * 
 */
package com.epam.string.day1;

/**
 * @author Akansh_Rai
 *
 * https://www.geeksforgeeks.org/reverse-words-given-string-java/
 */
public class StringReversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Welcome to geeksforgeeks";
		System.out.println(reverseString(input));
	}

	private static String reverseString(String input) {
		String result[] = input.split(" ");
		int  j = result.length-1;
		StringBuilder sb = new StringBuilder(result[j]);
		j--;
		while (j >= 0) {
			sb.append(" " + result[j--] );
		}
		return sb.toString();
	}

}
