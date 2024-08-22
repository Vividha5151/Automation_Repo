package Array;

public class ascendingorder {

	public static void main(String[] args) {
	

		int[] ascendingorder = { 51, -65, 25, 88, -10, 35, 65, -2, -11, 64 };
        int order = 0;
		System.out.println("Elements in original order: ");
		for (int i = 0; i < ascendingorder.length; i++) {
			System.out.print("   " + ascendingorder[i]);
		}
		for (int i = 0; i < ascendingorder.length; i++) {
			for (int j = i + 1; j < ascendingorder.length; j++) {
				if (ascendingorder[i] > ascendingorder[j]) {
					order = ascendingorder[i];
					ascendingorder[i] = ascendingorder[j];
					ascendingorder[j] = order;
				}
			}
		}

		System.out.println();
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < ascendingorder.length; i++) {
			System.out.print(" " + ascendingorder[i]);
		}
	}
}