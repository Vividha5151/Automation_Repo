package string_assignment;

public class remove_blank_spaces {

	public static void main(String[] args) {
		
		String s1 = "   Hello      all        of         you       Good       Evening        ";
		System.out.println("Original sentence - "+s1);
		System.out.println("Length = "+s1.length());
	   // s1=s1.replaceAll("\\s", "");//replace all method calling
		
		System.out.println("After removal of white spaces : "+s1.replaceAll("\\s", ""));
		
	
		
	}
}

