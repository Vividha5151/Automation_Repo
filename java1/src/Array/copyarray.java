package Array;

public class copyarray {

	public static void main(String[] args) {
	    
		int array[] = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int array1[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			array1[i] = array[i];
		}
		// Displaying original elements
		System.out.println("Elements of original array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array1[i]);
		}
		System.out.println();
		// Displaying copy elements

		System.out.print("Elements of copy array:  ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array1[i]);
		}
	}
}
