package Array;

public class sumofarray {

	public static void main(String[] args) {

		int sum[] = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("elements present in array " + sum.length);
		int Addition = 0;
		for (int i = 0; i < sum.length; i++) {
			Addition = Addition + sum[i];
		}
		System.out.println("Sum of all elements of array " + Addition);
	}

}
