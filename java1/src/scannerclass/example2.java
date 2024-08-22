package scannerclass;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		Scanner vi = new Scanner (System.in);
		int num1;
		double num2;
		float num3;
		boolean status;
		char grade;
		String name;
		System.out.println(" Enter Number= ");
		num1=vi.nextInt();
		System.out.println(" Enter Number= ");
		num2=vi.nextDouble();
		System.out.println(" Enter Number= ");
		num3=vi.nextFloat();
		System.out.println(" Enter Status= ");
		status=vi.nextBoolean();
		System.out.println(" Enter Grade= ");
		grade=vi.next().charAt(0);
		System.out.println(" Enter Name= ");
		name=vi.next();
		
		System.out.println(num1+"\n"+num2 +"\n"+ num3 +"\n"+ status+"\n"+ grade+"\n"+name );
	}

}
