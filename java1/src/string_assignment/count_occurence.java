package string_assignment;

public class count_occurence {

	public static void main(String[] args) {

		String s1 = "vividha";
		System.out.println("Original String - " + s1);

		String st = "";
		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			for (int j = i; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count++;
				}
			}
			 String s = String.valueOf(s1.charAt(i));
	            if(!st.contains(s)){
	            	st=st+s1.charAt(i);
	                System.out.println("Total number of count of occurance of "+s1.charAt(i)+" is "+count);
	            }         
	        }
	    }
	}