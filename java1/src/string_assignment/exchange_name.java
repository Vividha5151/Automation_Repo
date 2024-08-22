package string_assignment;
import java.util.Scanner;
public class exchange_name {

	public static void main(String[] args) {
	
	       String name="vividha sawarkar";
	        System.out.println("Before:\n"+name);
	        
	        String firstName=name.substring(0,name.indexOf(" "));
	        String lastName=name.substring(name.indexOf(" "));
	        String swapName=lastName+" "+firstName;
	        System.out.println("After:\n"+swapName);

	    }}

