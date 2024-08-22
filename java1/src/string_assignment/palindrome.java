package string_assignment;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		String s1 = "abcdedcba";
		System.out.println("Original string " + s1);
		System.out.println("Length " + s1.length());
		boolean status = true;

		for (int i = 0; i < s1.length() / 2; i++) {
			if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
				status = false;
				break;
			}
		}
		if (true)
			System.out.println("Given string is palindrome=  " + s1);
		else
			System.out.println("Given string is not a palindrome=  " + s1);
	}
}
