package Array;

public class smallestelement {

	public static void main(String[] args) {

		int  smallestelement[] =  { 100, 75, 200, 800, 950, 150, 840, 51 };
		System.out.println(" elements present in array " + smallestelement.length);
		int small = smallestelement[0];
		for (int i = 0; i < smallestelement.length; i++) {
			if (smallestelement[i] <small)
				small = smallestelement[i];

		}
		System.out.println("Smallest element of array " + small);
	}
}
