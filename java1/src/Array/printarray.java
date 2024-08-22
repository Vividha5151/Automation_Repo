package Array;

public class printarray {

	public static void main(String[] args) {
	
/*		int printarray[] =  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Element present in array= " + printarray.length);
		System.out.println("Print elements of array :- ");

		for (int i = 0; i < printarray.length; i++) {
			System.out.println("  "+printarray[i]);
		}

	}
}*/
int[] printarray;
printarray = new int[5];
System.out.println("Element present in array= " + printarray.length);
System.out.println("Print elements of array :- ");
printarray[0] = 10;
printarray[1] = 20;
printarray[2] = 30;
printarray[3] = 40;
printarray[4] = 50;

for (int i = 0; i < printarray.length; i++) {
	System.out.println(" " + printarray[i]);
}
}
}