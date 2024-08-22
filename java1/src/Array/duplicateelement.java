package Array;

public class duplicateelement {

	public static void main(String[] args) {
		
		int duplicate[] = new int[] { 1, 5, 10, 9, 8, 8, 1, 5, 7 };
		System.out.println("Elements present in array = " + duplicate.length);
		
		System.out.println("Print Duplicate Array:-  ");
		
		for (int i = 0; i < duplicate.length; i++) {
		
			for (int j = i+1; j < duplicate.length; j++) {
				if (duplicate[i] == duplicate[j])
					System.out.println(duplicate[j]);
			}
		}

	}
}
