package string_assignment;

public class repeated_nonrepeated_character {

	public static void main(String[] args) {
		String s = "JavaConceptOfTheDay";

		for (int i = 0; i < s.length(); i++);
		int count = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(count) == s.charAt(j)) {
				count++;
				break;
			}
		}
		if (count > 1) {
			System.out.println("First non Repeating character " + s.charAt(count));

		}
		for (int i = 0; i < s.length(); i++)
			;
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(count) == s.charAt(j)) {
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("First Repeating character " + s.charAt(count));

		}
	}
}