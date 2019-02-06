package com.epam.string.day2;

/**
 * @author Akansh_Rai
 *         https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 * 
 *         Question : Write a program to print all permutations of a given
 *         string permutations of string ABC. " ABC ACB BAC BCA CBA CAB "
 */
public class PrintAllPermutation {

	public static void main(String[] args) {
		String input = "ABC";
		printAllPermutation(input, 0, input.length() - 1);
	}

	private static void printAllPermutation(String input, int left, int right) {

		if (left == right)
			System.out.println(input);
		else {
			for (int i = left; i <= right; i++) {
				input = swap(input, left, i);
				printAllPermutation(input, left + 1, right);
				input = swap(input, left, i);
			}
		}

	}

	private static String swap(String input, int i, int j) {
		char temp;
		char[] charArray = input.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
