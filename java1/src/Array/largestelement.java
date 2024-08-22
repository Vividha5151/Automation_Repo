package Array;

public class largestelement {

	public static void main(String[] args) {
		
		int largestelement[] = new int[] { 100, 500, 150, 90, 152, 85, 50, 200 };
		System.out.println("Elements present in array " + largestelement.length);

		int largest = largestelement[0];
		for (int i = 0; i < largestelement.length; i++) {
			if (largestelement[i] > largest)
				largest = largestelement[i];
		}
		System.out.println("largest element of array " + largest);

	}
}

  