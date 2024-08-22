package string_assignment;

import java.util.Scanner;

public class reverse_each_word {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";
		System.out.println(makeReverse(str));
	}

	static String makeReverse(String str) {
		StringBuffer s = new StringBuffer(str);
		str = s.reverse().toString();
		String[] rev = str.split(" ");
		StringBuffer reverse = new StringBuffer();
		for (int i = rev.length - 1; i >= 0; i--) {
			reverse.append(rev[i]).append(" ");
		}
		return reverse.toString();
	}
}
/*String str1 = "DhanoriPune";// output: enuPironahD 
		
		String temp = "";// "DhanoriPune";//output: enuPironahD
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp = temp + str1.charAt(i);//""+e=>e+n=>en+u=>enu+P
		}
		System.out.println("Original str1: " + str1);
		System.out.println("Reverse temp: " + temp);
		System.out.println(reverseString("DhanoriPune"));
		
		String s1="Bangalore";
		System.out.println(reverseString(s1));
		
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("Enter String to be reverse: ");
		s2=scn.next();
		System.out.println("Reverse String is: "+reverseString(s2));
*/