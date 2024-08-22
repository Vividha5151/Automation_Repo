package Array;

public class oddposition {

	public static void main(String[] args) {
		
		int oddposition[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println("array size " + oddposition.length);
		System.out.println("Elements present on odd position");
		for (int i = 0; i < oddposition.length; i++) {
			if (i % 2 == 0) {

				System.out.println(" " + oddposition[i]);

			}
		}

	}

}
