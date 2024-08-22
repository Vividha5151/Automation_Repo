package Array;

public class Decendingorder {

	public static void main(String[] args) {
		
		int [] decending = {98, 85,25, 74, -8, 20, -60, -77, 33, -49};
		int d= 0;
		 System.out.print("Elements in original order: ");
	    for (int i = 0; i<decending.length; i++) {
	    	 System.out.println("    "+decending[i]);
	    }
	    for (int i = 0; i<decending.length; i++) {
	    	for (int j = i + 1; j < decending.length; j++) {
				if (decending[i] < decending[j]) {
					d = decending[i];
					decending[i] = decending[j];
					decending[j] = d;
	    }}}
	    System.out.println("Elements in descending order: ");    
	   for (int i = 0; i < decending.length; i++) {     
            System.out.print(" "+decending[i]);  
	    
   	}}}

	       