package string_assignment;

public class count_number {

	public static void main(String[] args) {

        String s1 = "hey1234876hey";
        System.out.println("Length= "+s1.length());
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i)))
            	count++;
        }
        System.out.println("Total number of Digits = "+count);
    }
}