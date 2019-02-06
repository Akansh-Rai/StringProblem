/**
 * 
 */
package com.epam.string.day1;

/**
 * @author Akansh_Rai
 *
 * https://www.geeksforgeeks.org/reverse-a-string-in-java/
 */
public class WordReversal {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		String input  = "Akansh";
		System.out.println(reversal(input));
	}

	private static String reversal(String input) {
		char[] inputArr = input.toCharArray();
		int i=0, j= input.length()-1;
		while (i<j) {
			char temp = input.charAt(i);
			inputArr[i] = inputArr[j] ; 
		    inputArr[j] = temp ;
		    i++;
		    j--;
		}
		return String.valueOf(inputArr);
	}

}
