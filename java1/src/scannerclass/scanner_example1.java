package scannerclass;

import java.util.Scanner;

public class scanner_example1 {

	public static void main(String[] args) {
		Scanner scn= new Scanner (System.in) ;
		 
		int num1, num2, result;
		System.out.println("Enter num 1-  ");
		num1=scn.nextInt();
		System.out.println("Enter num 2-  ");
		num2=scn.nextInt();
		
		result = num1+num2;
		System.out.println("addition of two numbers "+result);
	}

}
