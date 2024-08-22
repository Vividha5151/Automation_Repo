package assignment_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list_into_set {

	public static void main(String[] args) {
	 List<String> l1 = new ArrayList<String>();
	 l1.add("mango");
	 l1.add("Banana");
	 l1.add("Guava");
	 l1.add("Pear");
	 
	 System.out.println("Elements from list"+l1);
	 
	 Set S1 = new HashSet<String>(l1);
	 
	 System.out.println("Element from set "+S1);

	}

}
