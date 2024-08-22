package string_assignment;

public class immutable_prove {
	public static void Check(Object x, Object y) {
		if (x == y) {
			System.out.println("Both pointing to the same reference");

		} else {
			System.out.println("Both are pointing to different reference");
		}
	}

	public static void main(String[] args) {
		String st1 = "Java";
		String st2 = "Java";
		System.out.println("Before Modification in st1");
		Check(st1, st2);
		st1 += "ava";
		System.out.println("After Modification");
		Check(st1, st2);
	}
}