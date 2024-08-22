package string_assignment;

public class string_to_int {

	public static void main(String[] args) {
		String str = "123456789";
		int num = Integer.valueOf(str);
		System.out.println("int value = " + num);

		String num1 = String.valueOf(num);
		System.out.println("String value after conversion = " + num1);

	}

}