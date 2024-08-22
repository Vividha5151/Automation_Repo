package string_assignment;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		String str1 = "Vividha";
		String temp = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp = temp + str1.charAt(i);
		}
		System.out.println("Original str1: " + str1);
		System.out.println("Reverse temp: " + temp);
		System.out.println(reverseString("Vividha"));}
		
	/*	String s1="Bangalore";
		System.out.println(reverseString(s1));
		
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("Enter String to be reverse: ");
		s2=scn.next();
		System.out.println("Reverse String is: "+reverseString(s2));

		

	}*/

	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

	
	}
	
/*String sentence = "Go work";
String reversed = reverse(sentence);
System.out.println("The reversed sentence is: " + reversed);
}

public static String reverse(String sentence) {
if (sentence.isEmpty())
  return sentence;

return reverse(sentence.substring(1)) + sentence.charAt(0);*/
