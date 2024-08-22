package Array;

public class smallestnumber {

	public static void main(String[] args) {
	
		int smallest[]= { 522, 855, 145, 842, 110, 107, 950, 330} ;
		
		System.out.println(" elements present in array " + smallest.length);
		int small = smallest[0];
		for (int i = 0; i < smallest.length; i++) {
			if (smallest[i] <small)
				small = smallest[i];

		}
		System.out.println("Smallest element of array " + small);
	}
}

