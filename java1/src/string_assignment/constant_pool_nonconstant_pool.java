package string_assignment;

public class constant_pool_nonconstant_pool {

	public static void main(String[] args) {
		String s1 = "HELLO";  
		String s2 = "HELLO";  
		String s3 = new String("HELLO");  
		String s4 = new String("HELLO").intern();  
		System.out.println("String are equal, "+(s1 == s2));   
		System.out.println("String are not equal,"+(s1 == s3));   
		System.out.println("String are equal, "+(s1 == s4)); 
		

	}

}
